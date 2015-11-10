name := "CustomizeElasticSearch"

version       := "0.1"

scalaVersion  := "2.11.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  Seq(
    "org.elasticsearch" % "elasticsearch" % "1.7.0",
    "com.google.code.findbugs" % "jsr305" % "1.3.+"
  )
}

