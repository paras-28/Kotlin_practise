

fun main() {
    var arr: Array<String> = arrayOf("One", "Two", "Three")
    var arr1: Array<Int> = arrayOf(1, 2, 3)
    var arr2: Array<Int> = arrayOf<Int>(3, 4, 5)
//    for (i in 0..arr.size ) {
//        println(i)
//    }
    for (i : String in arr ) {
        println(i)
    }
    println("with index")
    for ((i,e) in arr.withIndex() ) {
        println("$e @ $i")
    }
}
