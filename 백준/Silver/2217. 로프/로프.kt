fun main() {
    val br = System.`in`.bufferedReader()
    val size = br.readLine().toInt()
    val ropes = (0..< size).map { br.readLine().toInt() }.sortedDescending()
    var max = ropes[0]
    
    for(ropeCount in 2..size) {
        val weight = ropeCount * ropes[ropeCount - 1]
        if(weight > max) {
            max = weight
        }
    }
    println(max)
}