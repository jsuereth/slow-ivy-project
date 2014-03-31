import sbt._
import Keys._

object Helper {	
	val Jetty = config("jetty")
	def complexProject(name: String): Project =
	  Project(name, file(name)).settings(
	  	 scalaVersion := "2.10.3",
	  	 resolvers += "typesafe-releases" at "http://repo.typesafe.com/typesafe/releases",
         libraryDependencies ++= 
           Seq(
             "com.typesafe.play" %% "play" % "2.2.1",
             "junit" % "junit" % "4.11" % "test",
             "org.apache.spark" %% "spark-streaming" % "0.9.0-incubating",
             "org.drools" % "drools-spring" % "6.0.0.Beta2",
             "com.typesafe.slick" %% "slick" % "2.0.1",
             "org.mortbay.jetty" % "jetty-management" % "6.1.24" % "jetty->default",
             "org.mortbay.jetty" % "jetty-naming" % "6.1.24" % "jetty->default",
             "org.mortbay.jetty" % "jetty-plus" % "6.1.24" % "jetty->default"
           )
	  ).configs(Jetty)
}
