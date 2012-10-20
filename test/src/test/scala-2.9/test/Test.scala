package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class TestSpect extends FlatSpec with ShouldMatchers {
  "The VersionDependent class" should "report correct scala version" in {
    val versionDependent = new VersionDependent
    versionDependent.hello should include("2.9")
  }
}