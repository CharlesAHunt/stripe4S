package com.charlesahunt.headers

import com.charlesahunt.Configuration
import sttp.model.Header

object Headers {

  def auth(accountName: String): Header = {
    val key = Configuration.key
    Header("Authorization", s"$accountName:$key")
  }

}