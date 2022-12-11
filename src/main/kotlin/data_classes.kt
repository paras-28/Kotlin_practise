fun main() {
    val obj = Human(age = 25, name = "Paras")
    val obj2 = Human(age = 25, name = "Paras")
     println(obj == obj2)
    var obj3 = obj2.copy(name = "John")
    
}


private data class Human(var age : Int , var name :String)
{
}