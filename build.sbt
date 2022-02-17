name := "data-pipeline-exercise"

organization := "com.artemishealth"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "3.1.2",
  "com.github.tototoshi" %% "scala-csv" % "1.3.10",
  "com.opencsv" % "opencsv" % "5.3"
)