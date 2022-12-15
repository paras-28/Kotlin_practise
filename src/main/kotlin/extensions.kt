fun main()
{
println("Hello World!".formattedString())
}

fun String.formattedString() : String {
   return "'''''''''''\n$this\n''''''"
}