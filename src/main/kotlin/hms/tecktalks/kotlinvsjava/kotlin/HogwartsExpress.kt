package hms.tecktalks.kotlinvsjava.kotlin

class HogwartsExpress(var platformNumber: String) {
}

data class KnightExpress(val model: String, val pessaengerCount: Int)

fun main(args: Array<String>){
    val train = HogwartsExpress("9 3/4")
    println("Train ${train}")
    println("Train ${train.platformNumber}")

    val bus = KnightExpress("123", 25)
    val bus1 = bus.copy(model = "456")
    println("Bus $bus")
    println("Bus $bus1")
}