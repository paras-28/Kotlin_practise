fun main() {
    var oneplus : Mobile2 = OnePlus2( "Smart ")
    oneplus.display()
    var generalMobile  = Mobile2( type ="General")
    generalMobile.display()
}

/*
*  parent can hold reference to its child
*  parent can call method of their child (which are common )
* */


open class Mobile2(val type: String) {
    open fun display() = println("Simple Mobile Display")

}

// initialize constructor
class OnePlus2(typeParam: String) : Mobile2(typeParam) {

    override fun display() = println("One Plus Display")
}


