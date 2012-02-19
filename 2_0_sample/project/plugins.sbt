// Comment to get more information during initialization
logLevel := Level.Warn

resolvers ++= Seq(
    DefaultMavenRepository,
    Resolver.url("Play", url("http://download.playframework.org/ivy-releases/"))(Resolver.ivyStylePatterns),
    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

//resolvers += Classpaths.typesafeResolver
 
//addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "1.4.0")
//addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0-RC1")

//libraryDependencies += "play" %% "play" % "2.0-RC2"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.0-RC2")