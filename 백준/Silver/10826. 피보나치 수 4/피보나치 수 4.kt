import java.math.BigInteger

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    val dp = Array(n + 1) { BigInteger.ZERO }
    repeat(n + 1) {
        dp[it] = when (it) {
            0 -> BigInteger.ZERO
            1 -> BigInteger.ONE
            2 -> BigInteger.ONE
            else -> dp[it - 1] + dp[it - 2]
        }
    }
    print(dp[n])
}