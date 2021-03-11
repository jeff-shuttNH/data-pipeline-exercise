name := "data-pipeline-exercise"

organization := "com.artemishealth"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.4.0",
  "com.github.tototoshi" %% "scala-csv" % "1.3.7",
  "com.opencsv" % "opencsv" % "5.3"
)