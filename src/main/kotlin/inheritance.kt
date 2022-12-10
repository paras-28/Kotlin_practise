fun main() {
    val oneplus = OnePlus(typeParam = "Smart ")
    oneplus.display()
    val generalMobile = Mobile( type ="General")
    generalMobile.display()
}

open class Mobile(val type: String) {
    open val name: String = ""

    open val size: Int = 5
    fun makeCall() = println("Calling From Mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

// initialize constructor
class OnePlus(typeParam: String) : Mobile(typeParam) {
    override val name: String = "One Plus"
    override val size: Int = 6
    override fun display() = println("One Plus Display")
}

open class Rectangle {
    open fun draw() {
        println("Drawing a rectangle")
    }

    val borderColor: String
        get() {
            return "black"
        }
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}