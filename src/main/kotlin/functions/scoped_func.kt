fun main()
{
    //

    var employee = Employee();

    employee.apply {
        id = 21
        name = "JOHN"
    }

    // Null safety
    employee.let {
        it.id = 21
       it.name = "JOHN"
    }
    println(employee)
}


private  data class Employee(var id : Int = 0 , var name : String= "" )
