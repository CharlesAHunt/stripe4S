package com.charlesahunt.model

final case class PaymentIntentRequest(
                                id: String,
                                `object`: String,
                                amount: Int,
                                amount_capturable: Int,
                                amount_received: Int,
                                application: String,
                                application_fee_amount: Int,
                                canceled_at: String,
                                cancellation_reason: String,
                                capture_method: String,
                                charges: Option[Charges],
                                client_secret: String,
                                confirmation_method: String,
                                created: Long,
                                currency: String,
                                customer: String,
                                description: String,
                                invoice: String,
                                last_payment_error: String,
                                livemode: Boolean,
                                metadata: Metadata,
                                next_action: String,
                                on_behalf_of: String,
                                payment_method: String,
                                payment_method_options: Option[PaymentOptions],
                                payment_method_types: List[Card],
                                receipt_email: String,
                                review: String,
                                setup_future_usage: String,
                                shipping: String,
                                statement_descriptor: String,
                                statement_descriptor_suffix: String,
                                status: String,
                                transfer_data: String,
                                transfer_group: String
                              )
final case class Metadata()
final case class Charges()
final case class PaymentOptions()
final case class Card()