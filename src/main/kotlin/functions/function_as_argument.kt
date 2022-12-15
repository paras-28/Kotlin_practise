fun main() {


    var fun1: (Int) -> Number = ::addF

     acceptFunAsArg(10, fun1)

     acceptFunAsArg(10, fun (arg :Int ) : Number
     {
         return arg+5
     })

    var singleLineLambda = { x: Int, y: Int -> x + y }

    var singleLineLambda2 : (Int, Int)-> Number = { x, y -> x + y }

    // in multiLine LAmbda last line is the return
    var multiLineLambda = {
        var x = 10
        var y = 10
        println()
        x + y
    }
    println(multiLineLambda())
    println(singleLineLambda(10, 20))
//    var obj3 = acceptFunAsArg(10 , )
}

// inline keyword to save memory
private inline fun addF(num1: Int): Number {
    val sum = num1 + 5
    return sum
}

private fun acceptFunAsArg(num1: Int, fn: (num2: Int) -> Number): Int {
    var obj = fn(20);
    return num1 + obj.toInt()
}




