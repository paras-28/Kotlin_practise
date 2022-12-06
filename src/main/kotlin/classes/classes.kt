fun main() {
    val mustang = Automobile(type = "petrol", kmRan = 100, name = "mustang" , hasAirBags = true)
    val maruti = Automobile( "maruti",  200)
    println(maruti.name)
//    println(maruti.hasAirBags)
}

// here hasAirbags is parameter remaining are properties
class Automobile(val name: String, val type: String , var kmRan: Int,  hasAirBags: Boolean) //properties
{



    constructor (nameParam: String , kmRan: Int) :
            this(nameParam,  "Petrol",  kmRan,  true )

    init {
        println("first initializer")
    }
    // Runs in sequence
    init {
        println("second  initializer")
    }
//    val airBags = hasAirBags

    fun driveCar() { //methods
        println("Car is driving")
    }

    fun applyBrakes() {
        println("Applied Brakes")
    }
}


class Person(nameParam: String, ageParam: Int) {
    val name: String = nameParam
    var age: Int = ageParam
}