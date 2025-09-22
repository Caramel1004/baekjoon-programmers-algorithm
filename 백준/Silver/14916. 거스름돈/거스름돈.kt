fun main() {
    val br = System.`in`.bufferedReader()
    val value = br.readLine().toInt()

    val largestCoinCount = value / 5
    var coinCount = -1

    if(largestCoinCount * 5 == value) {
        print(largestCoinCount)
        return
    }

    for(count in largestCoinCount downTo 0) {
        val remainedValue = value - (5 * count)
        if(remainedValue % 2 == 0) {
            coinCount = count + (remainedValue / 2)
            break
        }
    }
    print(coinCount)
}