package chp3

import scala.collection.mutable.ArrayBuffer

object ChapterThreeAnswers {
    def dedupe(ints: Array[Int]): Any = {
        ints.distinct
    }

    def reverseAdjacent(integers: Array[Int]): Any = {
        for (i <- 0 until (integers.length, 2); j <- (i+1).to(i,-1) if (j < integers.length)) yield integers(j)
    }

    def evenFollowedByOdd(ints: Array[Int]): Any = {
        var ordered = ArrayBuffer[Int]()
        for (i <- ints if (i % 2 == 0)) ordered += i
        for (j <- ints if (j % 2 == 1)) ordered += j
        ordered.toArray
    }

    def average(doubles: Array[Double]): Any = {
        doubles.sum / doubles.length
    }

    def reverseSorted(ints: Array[Int]): Any = {
        ints.sortWith((x, y) => (x < y)).reverse
    }

    def reverseSortedForBuffer(ints: ArrayBuffer[Int]): Any = {
        ints.sortWith((x, y) => (x < y)).reverse
    }
}

class ChapterThreeAnswers {


}
