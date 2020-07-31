package com.charlesahunt

import cats.effect.{ConcurrentEffect, ContextShift, Resource}
import cats.implicits._
import com.charlesahunt.headers.Headers
import com.charlesahunt.model.{ConfirmPaymentIntentResponse, PaymentIntentRequest, PaymentIntentResponse}
import sttp.client.circe._
import io.circe.{Error => CirceError}
import io.circe.generic.auto._
import org.http4s.client.blaze.BlazeClientBuilder
import sttp.client._

import scala.concurrent.ExecutionContext
import sttp.model.Uri

trait StripeClient[F[_]] {

  def baseURI: Uri

}

/**
 *  Stripe client sdk
 *
 * @tparam F Effectful type
 */
object StripeClient {

  def usingClient[F[_]: ConcurrentEffect: ContextShift]: Resource[F, SttpBackend[F, Nothing, Nothing]] = {
    import sttp.client.http4s._
    val client = BlazeClientBuilder.apply[F](ExecutionContext.global)
    Http4sBackend
      .usingClientBuilder[F](client, BlockingIO.blockingContext("stripe-client"))
  }
}

class StorageClient[F[_]: ConcurrentEffect: ContextShift](account: String)(
  implicit val backend: SttpBackend[F, Nothing, Nothing]
) extends StripeClient[F] {

  val baseURI: Uri = uri"https://api.stripe.com/v1"

  /**
   * Creates a PaymentIntent object.
   *
   * After the PaymentIntent is created, attach a payment method and confirm to continue the payment
   *
   * @return PaymentIntentResponse
   */
  def createPaymentIntent(
                       paymentIntent: PaymentIntentRequest,
                     ): F[Either[ResponseError[CirceError], PaymentIntentResponse]] =
    basicRequest
      .header(Headers.auth(account))
      .post(
        uri"$baseURI/payment_intents"
      ).body(paymentIntent.toString)//TODO JSON STRING
      .contentType("application/json")
      .response(asJson[PaymentIntentResponse])
      .send()
      .map(_.body)

  /**
   * Confirm that your customer intends to pay with current or provided payment method.
   * Upon confirmation, the PaymentIntent will attempt to initiate a payment.
   *
   * @return ConfirmPaymentIntentResponse
   */
  def confirmPaymentIntent(payment_method: String,
                          id: String
              ): F[Either[ResponseError[CirceError], ConfirmPaymentIntentResponse]] =
    basicRequest
      .header(Headers.auth(account))
      .get(
        uri"$baseURI/payment_intents/$id/confirm?payment_method=$payment_method"
      )
      .contentType("application/json")
      .response(asJson[ConfirmPaymentIntentResponse])
      .send()
      .map(_.body)

}
