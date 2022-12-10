import java.util.*

fun main() {
    val p1 = Person2(  "A",  21)
    println(p1.name)
    p1.age = 23
    p1.age = -12
    }

class Person2 (nameParam: String, ageParam: Int) {
    var name: String = nameParam
        get() {
            return field.uppercase(Locale.getDefault())
        }
    var age: Int = ageParam
        get()
        {
            return  field+1;
        }
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Age can't be negative")
                0 - 0 - 0
            }
        }
}