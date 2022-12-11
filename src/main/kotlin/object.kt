fun main() {
    fun main() {
        var obj = object : Cloneable {
            override fun clone() {
                println("I am cld")
            }
        }
    }

    println(AB.num)
    BC.test()
}

interface Cloneable {
    fun clone()
}


object AB {
    val num: Int = 10
}

object BC {
    val p: Int = 20
    fun test() {
        println("I am Object B")
    }
}