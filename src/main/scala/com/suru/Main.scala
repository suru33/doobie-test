package com.suru

import cats.effect.{ExitCode, IO, IOApp}

import doobie._
import doobie.postgres._
import doobie.free.connection.ConnectionIO
import doobie.implicits._
import cats._
import cats.effect._
import cats.implicits._

import cats.effect._
import cats.implicits._
import doobie._
import doobie.free.connection.ConnectionIO
import doobie.implicits._
import doobie.util.ExecutionContexts

object Main {
//  implicit val cs = IO.contextShift(ExecutionContexts.synchronous)
//  val program1 = 42.pure[ConnectionIO]

  //  implicit val cs: ContextShift[IO] = IO.contextShift(ExecutionContext.global)
  //
  //  val xa = Transactor.fromDriverManager[IO](
  //    "org.postgresql.Driver",
  //    "jdbc:postgresql://localhost:5432/doobie",
  //    "pgsuru",
  //    "password",
  //    Blocker.liftExecutionContext {
  //      ExecutionContexts.synchronous
  //    }
  //  )
//  override def run(args: List[String]): IO[ExitCode] = {
//    //    program1.as(ExitCode.Success)
//    IO.println("I did it!").as(ExitCode.Success)
//  }

//  sql"""
//       """
}
