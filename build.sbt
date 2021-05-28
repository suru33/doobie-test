name := "doobie-test"

version := "0.1"

scalaVersion := "2.13.5"

resolvers ++= Seq(
  "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.9.2",
  "org.typelevel" %% "cats-core" % "2.5.0",
  "org.typelevel" %% "cats-effect" % "3.0.1",
  "org.postgresql" % "postgresql" % "42.2.19",
  "org.tpolecat" %% "doobie-core" % "0.12.1",
  "org.tpolecat" %% "doobie-hikari" % "0.12.1",
  "org.tpolecat" %% "doobie-postgres" % "0.12.1",
  "com.chuusai" %% "shapeless" % "2.3.3"
)
