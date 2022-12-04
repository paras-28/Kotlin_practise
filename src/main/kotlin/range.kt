fun main(args: Array<String>) {
    var number: Int = 5;
    var isExist: Boolean = number in 1..5
    println(isExist)
    var isExist2: Boolean = number in 1 until  5
    print(isExist2)
}