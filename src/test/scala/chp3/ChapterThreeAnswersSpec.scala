package chp3

import org.scalatest._

import scala.collection.mutable.ArrayBuffer

class ChapterThreeAnswersSpec extends FlatSpec with Matchers {

    it should "reverse adjacent numbers in an array" in {
        assertResult(Array(2,1,4,3,5))(ChapterThreeAnswers.reverseAdjacent(Array(1,2,3,4,5)));
    }

    it should "produce an array that contains even followed by odd numbers" in {
        assertResult(Array(20,14,6,4,10,15,3,5,13,3))(ChapterThreeAnswers.evenFollowedByOdd(Array(20,15,3,14,5,13,3,6,4,10)))
    }

    it should "calculate the average of an array of doubles" in {
        assertResult(15.0)(ChapterThreeAnswers.average(Array(0.0, 5.0, 10.0, 15.0, 20.0, 25.0, 30.0)))
    }

    it should "rearrange order of array of ints in reverse sorted order" in {
        assertResult(Array(10,9,8,7,6,5,4,3,2,1))(ChapterThreeAnswers.reverseSorted(Array(5,7,4,8,6,9,3,1,2,10)))
    }

    it should "rearrange order of arraybuffer of ints in reverse sorted order" in {
        assertResult(ArrayBuffer(10,9,8,7,6,5,4,3,2,1))(ChapterThreeAnswers.reverseSortedForBuffer(ArrayBuffer(5,7,4,8,6,9,3,1,2,10)))
    }

    it should "remove all duplicates from an array" in {
        assertResult(Array(1,2,3,4,5))(ChapterThreeAnswers.dedupe(Array(1,1,2,2,3,3,4,4,5,5)))
    }

    it should "filter by specified timezone" in {
        assertResult(164)(ChapterThreeAnswers.getTimezones("America").length)
    }
}