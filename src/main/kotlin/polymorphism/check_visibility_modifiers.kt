

/*
fun main() {
    var oneplus : Mobile2 = Samsung( "Smart ")
    oneplus.display()
    var generalMobile  = Mobile2( type ="General")
    generalMobile.display()
}
*/


fun main() {
    val obA = A()
    val obB = B()
    print("${obA.p}")
}


open class A {
    public var p = 10
    private var g = 20
    internal var r = 30
    protected var s = 40
}


class B : A() {
    fun test() {
        println(p)
//        println(q)
        println(r)
        println(s)
    }
}