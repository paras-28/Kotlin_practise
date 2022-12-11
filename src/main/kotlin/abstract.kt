fun main() {
    val obj : Parent = Child(typeParam = "Smart ")
    val obj2 = Mobile(typeParam = "Smart ")
    obj.display()

}

private interface MyInterface {
    fun bar()
    fun foo() {
        // optional body
    }
}


 private abstract   class Parent(val type: String) : MyInterface  {
   abstract  fun display()
     fun display2()
     {

     }

}

// initialize constructor
class Child(typeParam: String) : Parent(typeParam) , MyInterface {
    override fun display() = println("One Plus Display")
    override fun bar() {
        TODO("Not yet implemented")
    }
}

