package com.suru.models

trait UserType extends Enumeration {
  type UserType = Value

  val IT_ADMIN: Value = Value("IT_ADMIN")
  val HR: Value = Value("HR")
  val MANAGER: Value = Value("MANAGER")
  val LEAD: Value = Value("LEAD")
  val DEV: Value = Value("DEV")
}
