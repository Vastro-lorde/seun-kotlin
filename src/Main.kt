fun main() {
    println("Seun Omatsola")
    val seun = User("Seun Omatsola", 29)
    seun.describe()
    val copySeun = seun.country

    println(seun.country)
    seun.country = "England"
    println(seun.country)
    seun.listNames("my name is", "Seun daniel", "Omatsola")

    val operate = Operations()
    operate.listXs()
    operate.fillXs()
    operate.listXs()
    operate.setX()
    println(operate.check(7))
    println(operate.deepCheck(seun.country, copySeun))
    println(operate.equals(operate))

}