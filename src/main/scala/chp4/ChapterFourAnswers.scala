package chp4

object ChapterFourAnswers {
    def discounted(items: Map[String, Int]): Any = {
        for ((k, v) <- items) yield (k, v * 0.9)
    }

}

class ChapterFourAnswers {

}
