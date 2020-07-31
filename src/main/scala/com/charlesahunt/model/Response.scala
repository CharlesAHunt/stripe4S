package com.charlesahunt.model


/**
 * Response from Stripe for a PaymentIntent
 */
final case class PaymentIntentResponse(
//  id: String,
//  `object`: String,
//  amount: Int,
//  amount_capturable: 0,
//  amount_received: 1000,
//  application: null,
//  application_fee_amount: null,
//  canceled_at: null,
//  cancellation_reason: null,
//  capture_method: automatic,
//  charges: {
//    object: list,
//    data: [
//  {
//    id: ch_1EXUPv2eZvKYlo2CStIqOmbY,
//    object: charge,
//    amount: 1000,
//    amount_refunded: 0,
//    application: null,
//    application_fee: null,
//    application_fee_amount: null,
//    balance_transaction: txn_1EXUPv2eZvKYlo2CNUI18wV8,
//    billing_details: {
//    address: {
//    city: null,
//    country: null,
//    line1: null,
//    line2: null,
//    postal_code: null,
//    state: null
//  },
//    email: null,
//    name: null,
//    phone: null
//  },
//    calculated_statement_descriptor: Stripe,
//    captured: true,
//    created: 1557239835,
//    currency: usd,
//    customer: null,
//    description: One blue fish,
//    disputed: false,
//    failure_code: null,
//    failure_message: null,
//    fraud_details: {},
//    invoice: null,
//    livemode: false,
//    metadata: {},
//    on_behalf_of: null,
//    order: null,
//    outcome: {
//    network_status: approved_by_network,
//    reason: null,
//    risk_level: normal,
//    risk_score: 9,
//    seller_message: Payment complete.,
//    type: authorized
//  },
//    paid: true,
//    payment_intent: pi_1HAm5GEZfSAHGInXFhk64hV4,
//    payment_method: pm_1EXUPv2eZvKYlo2CUkqZASBe,
//    payment_method_details: {
//    card: {
//    brand: visa,
//    checks: {
//    address_line1_check: null,
//    address_postal_code_check: null,
//    cvc_check: null
//  },
//    country: US,
//    exp_month: 5,
//    exp_year: 2020,
//    fingerprint: Xt5EWLLDS7FJjR1c,
//    funding: credit,
//    installments: null,
//    last4: 4242,
//    network: visa,
//    three_d_secure: null,
//    wallet: null
//  },
//    type: card
//  },
//    receipt_email: null,
//    receipt_number: 1230-7299,
//    receipt_url: https://pay.stripe.com/receipts/acct_1032D82eZvKYlo2C/ch_1EXUPv2eZvKYlo2CStIqOmbY/rcpt_F1XUd7YIQjmM5TVGoaOmzEpU0FBogb2,
//    refunded: false,
//    refunds: {
//    object: list,
//    data: [],
//    has_more: false,
//    url: /v1/charges/ch_1EXUPv2eZvKYlo2CStIqOmbY/refunds
//  },
//    review: null,
//    shipping: null,
//    source_transfer: null,
//    statement_descriptor: null,
//    statement_descriptor_suffix: null,
//    status: succeeded,
//    transfer_data: null,
//    transfer_group: null
//  }
//    ],
//    has_more: false,
//    url: /v1/charges?payment_intent=pi_1HAm5GEZfSAHGInXFhk64hV4
//  },
//  client_secret: pi_1HAm5GEZfSAHGInXFhk64hV4_secret_9J35eTzWlxVmfbbQhmkNbewuL,
//  confirmation_method: automatic,
//  created: 1524505326,
//  currency: usd,
//  customer: null,
//  description: One blue fish,
//  invoice: null,
//  last_payment_error: null,
//  livemode: false,
//  metadata: {},
//  next_action: null,
//  on_behalf_of: null,
//  payment_method: pm_1EXUPv2eZvKYlo2CUkqZASBe,
//  payment_method_options: {},
//  payment_method_types: [
//  card
//  ],
//  receipt_email: null,
//  review: null,
//  setup_future_usage: null,
//  shipping: null,
//  statement_descriptor: null,
//  statement_descriptor_suffix: null,
//  status: succeeded,
//  transfer_data: null,
//  transfer_group: null
 )

final case class ConfirmPaymentIntentResponse()