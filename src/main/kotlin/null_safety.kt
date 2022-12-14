fun main() {

    var data: String? = null

    data?.uppercase()

    data?.let {
        data.uppercase()
    }
    data!!.uppercase()

    var list = mutableListOf<Int>(1,2)
    var list2 = listOf<Int>()

    // not possible because its immutable
//    list2.add(1)
}


