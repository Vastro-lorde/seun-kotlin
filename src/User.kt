open class Person(open var country: String, open var sex: String, open var age: Int = 0)

class User(name: String, age: Int) : Person("Nigeria", "Male", age) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("Age must be greater than 0")
        }
    }

    private var name: String = name
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException("Name cannot be blank")
            }
            field = value
        }

    fun describe() {
        println("$name is a $age years old $sex from $country")
    }

    fun listNames(vararg names: String) {
        for (name in names) {
            println(name)
        }
    }
}