fun main()
{
    var obj : Tile = Red("RED Color");

    var nameAppend = when(obj)
    {
        is Red -> "Color is red"
        is Blue -> "Color is red"
    }
    println(nameAppend)
}

/*
* we can make multiple objects by restricting its type
* */

sealed class Tile()

class Red(val nameP : String) : Tile()
{

}
class Blue(val nameP : String) : Tile()
{

}