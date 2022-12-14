fun main() {
    var data = mutableMapOf<Int, String>()
    var data2 = mapOf<Int, String>(1 to "PAras", 2 to "PARAS2")

    data.put(0, "PARAS")
    data.put(1, "PARAS2")
    data.put(2, "PARAS3")

    for ((key, value) in data) {
        println("at index ${key} = $value")
    }


    // List
    var list = mutableListOf<Int>(1, 2, 3)
    // this is immutable
    var list2 = listOf<Int>(1, 2, 3)

}