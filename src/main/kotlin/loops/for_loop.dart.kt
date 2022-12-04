

fun main() {
    var list : IntRange = 1..5

    for (i in 1 until 4) {
        println(i)
    }

    // step 2
    for (i in list step 2 ) {
        println(i)
    }

    for (i in 10 downTo 0 step 2  ) {
        println(i)
    }
    //

    var count : Int = 5
      for (i in 0 ..count) {
        println(i)
    }


}

