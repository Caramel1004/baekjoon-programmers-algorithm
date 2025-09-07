import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val moneyTypeCount = st.nextToken().toInt() // 화페 종류 가지 수
    val totalMoney = st.nextToken().toInt() // 돈 가치
    // 오름 차순
    val values = (0..<moneyTypeCount)
        .map { br.readLine().toInt() }
        .filter { it <= totalMoney }
        .sorted()
    val dp = Array(totalMoney + 1) { 0 }
    dp[0] = 1 // 자기 자신 금액일 때, 빼면 0 이므로 미리 1로 세팅
    
    // 누적 
    for(value in values) {
        for (money in value..totalMoney) {
            dp[money] += dp[money - value]
        }
    }
    print(dp[totalMoney])
}