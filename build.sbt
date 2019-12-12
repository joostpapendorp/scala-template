name := "template"
organization := "nl.papendorp"
version := "0.1-SNAPSHOT"

scalaVersion := "2.13.1"

lazy val akkaVersion = "2.6.0"
lazy val scalazVersion = "7.2.29"
lazy val scalafxVersion = "12.0.2-R18"
lazy val slf4jVersion = "2.12.1"

lazy val scalaTestVersion = "3.1.0-RC3"
lazy val scalaTestPlusVersion = "3.1.0.0-RC2"
lazy val scalaCheckVersion = "1.14.1"
lazy val scalaMockVersion = "4.4.0"

unmanagedClasspath in Runtime += baseDirectory.value / "src" / "main" / "resources"

scalacOptions ++= Seq(
	"-Ymacro-annotations",
	"-deprecation",
	"-unchecked",
	"-feature",
)

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
	"com.typesafe.akka" %% "akka-stream" % akkaVersion,

	"org.scalafx" %% "scalafx" % scalafxVersion,
	"org.scalafx" %% "scalafxml-core-sfx8" % "0.5",

	"org.scalaz" %% "scalaz-core" % scalazVersion,
	"org.apache.logging.log4j" % "log4j-slf4j-impl" % slf4jVersion,

	"org.scalatest" %% "scalatest" % scalaTestVersion % Test,
	"org.scalatestplus" %% "scalatestplus-scalacheck" % scalaTestPlusVersion % Test,
	"org.scalacheck" %% "scalacheck" % scalaCheckVersion % Test,

	"com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
	"com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,

	//http://scalamock.org/quick-start/
	"org.scalamock" %% "scalamock" % scalaMockVersion % Test
)
