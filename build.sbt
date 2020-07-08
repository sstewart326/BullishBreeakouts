name := "BullishBreakouts"
 
version := "1.0" 
      
lazy val `bullishbreakouts` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.13.3"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice ) ++ Dependencies.projectDependencies

unmanagedResourceDirectories in Test +=  baseDirectory ( _ /"target/web/public/test" ).value
