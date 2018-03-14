package hms.tecktalks.kotlinvsjava.kotlin

fun main(args: Array<String>) {
    val max = getMaxVal(40, 50)
    val max2 = getMaxValV2(40, 50)
    println("Max : $max")
    println("Max2 : $max2")

    val intVal = getIntVal("Two")
    println("Int val $intVal")
}

//Traditional if-else
fun getMaxVal(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

//if-else as an expression
fun getMaxValV2(a: Int, b: Int): Int {
    val max = if (a > b) {
        a
    } else {
        b
    }

    return max
}

fun getIntVal(str: String): Int {
    return when (str) {
        "One" -> 1
        "Two" -> 2
        else -> 0
    }
}