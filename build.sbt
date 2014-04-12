name := "todolist"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

//val appDependencies = Seq(
//
//  "mysql" % "mysql-conector-java" % "5.1.18"
//)