import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val size = st.nextToken().toInt()
    val value = st.nextToken().toInt()
    val nums = br.readLine().split(" ").map { it.toInt() }

    val prefixSums = Array(size + 1) { 0 }
    for(i in 1..size) {
        prefixSums[i] += nums[i - 1] + prefixSums[i - 1]
    }

    var count = 0
    repeat(size + 1) {
        if (it > 0) {
            for (i in 0..<it) {
                if (prefixSums[it] - prefixSums[i] == value) {
                    count++
                }
            }
        }
    }
    print(count)
}