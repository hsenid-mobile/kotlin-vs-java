package hms.tecktalks.kotlinvsjava.kotlin


fun main(args: Array<String>) {
    val strObj: Any = "Hello Kotlin"
    if (strObj is String) {
        println("Length ${strObj.length}")
    }
}