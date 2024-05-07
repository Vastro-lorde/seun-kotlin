import java.util.Scanner

class Operations {
    var x: Int = 0
    var xs = ArrayList<String>()

    fun fillXs() {
        xs.add("first")
        for (x in 1..20){
            xs.add(x.toString())
        }
        xs.add("Last")
    }

    fun listXs() {
        for (x in xs){
            print(x)
        }
    }

    fun setX() {
      val  sc = Scanner(System.`in`)
        println("Enter value for x:")
        x = sc.nextInt()
        println(x)
    }

    fun check(y: Int) : Boolean{
        return x == y
    }

    fun deepCheck( first: String, second: String) : Boolean{
        return first === second
    }
}