fun main() {
    val n = readln().toInt()

    val case1 = n * 78 / 100
    val case2 = (n * 80 / 100) + (n * 20 / 100 * 78 / 100)

    println("$case1 $case2")
}
