package com.charlesahunt

import pureconfig.ConfigSource
import pureconfig.generic.auto._

object Configuration {
  val key: String = ConfigSource.default.at("stripe4S").load[Stripe4SConfig] match {
    case Right(configuration) => configuration.apiKey
    case Left(error) =>
      println(error.toList.toString())
      sys.exit(1)
  }
}

final case class Stripe4SConfig(apiKey: String, secretKey: String)