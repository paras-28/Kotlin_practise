@file:Suppress("UNUSED_VARIABLE")

fun main() {
    val result = add(4, 5)

    //Named parameters
    add(num1 = 4, num2 = 6)
    println(result)

    val result2 = add(5)
    println(result2)

   var obj: (num1: Int, num2: Int) -> Int = ::subtraction


    // can't assign when overloading
//Overload resolution ambiguity. All these functions match.
//   var obj2   = ::add
}

fun add(num1: Int, num2: Int = 9): Number {
    val sum = num1 + num2
    return sum
}

/*fun add(num1: Double, num2: Double = 9.0): Number {
    val sum = num1 + num2
    return sum
}*/

fun add(num1: Int): Number {
    val sum = num1 + 5
    return sum
}


// In line function
// like we have fatarrow function in  Dart
fun subtraction(num1: Int, num2: Int): Int = num1 - num2



