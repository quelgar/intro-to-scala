name := "intro-to-scala"

version := "0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test

scalaVersion := "3.0.2"

scalacOptions ++= Seq(
  "-Werror"
  // "-language:strictEquality"
)
