import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "2_0_sample"
    val appVersion      = "1.0"

    val appDependencies = Seq(
        "postgresql" % "postgresql" % "8.4-702.jdbc4"
    )

    val main = PlayProject(appName, appVersion, appDependencies).settings(defaultScalaSettings:_*).settings(
      // Add your own project settings here      
    )

}
