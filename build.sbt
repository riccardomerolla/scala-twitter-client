name := "scala-twitter-client"

version := "1.0"

scalaVersion := "2.10.2"

resolvers ++= Seq("Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository",
        "Signpost releases" at "https://oss.sonatype.org/content/repositories/signpost-releases/")

libraryDependencies ++= Seq(
		    "oauth.signpost" % "signpost-core" % "1.2",
		    "oauth.signpost" % "signpost-commonshttp4" % "1.2", 
		    "org.apache.httpcomponents" % "httpclient" % "4.2",
		    "org.apache.commons" % "commons-io" % "1.3.2"
)