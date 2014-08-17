package chp4

import org.scalatest.{Matchers, FlatSpec}

class ChapterFourAnswersSpec extends FlatSpec with Matchers {

    it should "return 10 percent discount of coveted gizmos" in {
        val gizmos: Map[String, Int] = Map( "Macbook Pro" -> 1000, "iPhone 4s" -> 350, "Xbox 360" -> 100, "42 inch TV" -> 400)
        assertResult(Map("Macbook Pro" -> 900, "iPhone 4s" -> 315, "Xbox 360" -> 90, "42 inch TV" -> 360))(ChapterFourAnswers.discounted(gizmos))
    }
}
