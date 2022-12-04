fun main() {
    val animal = "Dog"
    /*if(animal == "Horse"){
        println("Animal is Horse")
    }
    else if( animal == "Cat") {
        println("Animal is Cat")
    }
    else if(animal == "Dog") {
        println("Animal is Dog")
    }
    else{
        println("Animal Not Found")
    }*/
    when (animal) {
        "Horse" -> tellsWhichAnimal("Horse")
        "Cat" -> tellsWhichAnimal("Cat")
        "Dog" -> tellsWhichAnimal("Dog")
        else -> println(("Animal Not Found"))
    }

    // case 2
    val number = 13
    val result = when (number) {
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "Not in range"
    }
    println(result)
}

fun tellsWhichAnimal(name: String) {
    println("Animal is ${name}")
}

