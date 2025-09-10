import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val nums = br.readLine().fold(mutableListOf<Int>()) { acc, c ->
        if(acc.isEmpty() || acc.lastOrNull() != c.digitToInt()) {
            acc += c.digitToInt()
        }
        acc
    }
    val oneCount = nums.count { it == 1 }
    val zeroCount = nums.size - oneCount

    print(min(oneCount, zeroCount))
}