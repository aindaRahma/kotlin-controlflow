fun main() {
    val rangeInt = 1..7 step 1
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}
