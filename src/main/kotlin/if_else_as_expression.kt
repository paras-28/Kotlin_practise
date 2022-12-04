fun main() {
    val x = 10
    val y = 10
    val result = if (x > y) {
        "X is greater than Y"
    } else if (x < y) {
        "X is less than Y "
    } else {
        "X is equal to Y"
    }
    println(result)

    // case 2
    val number = 21
    val result2 = if (number % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
    println(result2)

}