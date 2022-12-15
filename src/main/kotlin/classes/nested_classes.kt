fun main()
{
println(ParentM().Child().test())
}

class  ParentM{

    var sirName = "ABCD"

 inner class  Child
    {
        fun test()
        {
            println("My Sirname is ${sirName}")
        }
    }
}
