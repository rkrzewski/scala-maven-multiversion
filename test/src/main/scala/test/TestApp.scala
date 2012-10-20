package test

object TestApp extends App {
  val versionDependent = new VersionDependent()
  println(versionDependent.hello)
}