package com.suru.models

import play.api.libs.json.JsObject

import java.util.{Date, UUID}

case class PrimeUser(
    id: Long,
    uuid: UUID,
    name: String,
    dob: Option[Date],
    email: String,
    country: String,
    userType: UserType,
    roles: Option[List[String]],
    extras: JsObject
)
