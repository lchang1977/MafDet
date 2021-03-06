name := "DDoS-Detection-System"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq(
  "-encoding", "UTF-8",
  "-deprecation", "-unchecked", "-feature", "-Xlint", "-Ywarn-infer-any")

fork in Test := true

//scalacOptions := Seq(
//  "-encoding", "UTF-8", "-opt:l:classpath",
//  "-deprecation", "-unchecked", "-feature", "-Xlint", "-Ywarn-infer-any")

libraryDependencies ++= Seq(
  "org.log4s" %% "log4s" % "1.3.4",
  "ch.qos.logback" % "logback-classic" % "1.1.8",
  "org.scalaj" %% "scalaj-http" % "2.3.0",
  "org.json4s" %% "json4s-native" % "3.5.0",
  "org.specs2" %% "specs2-core" % "3.8.8" % "test",
  "org.specs2" %% "specs2-gwt" % "3.8.8" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.4.17",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.17",
  "com.github.tototoshi" %% "scala-csv" % "1.3.4",
  //"com.typesafe.akka" %% "akka-stream" % "2.4.17",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.17"
)

scalacOptions in Test ++= Seq("-Yrangepos")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation", "-Xmx1g")

//javaOptions in (Test) += "-Xdebug"

//javaOptions in (Test) += "-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=9999"
