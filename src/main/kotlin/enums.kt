fun main()
{
    println(Day.Monday);
    println(Day.Monday.number);
    println(Day.Monday.printFormattedDay());
}

enum class Day(val  number: Number){
    Sunday(1),
    Monday(2);

    fun printFormattedDay()
    {
        println("Day is ${this}");
    }
}