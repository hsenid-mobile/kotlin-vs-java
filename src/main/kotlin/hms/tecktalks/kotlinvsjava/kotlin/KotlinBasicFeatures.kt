package hms.tecktalks.kotlinvsjava.kotlin

fun main(args: Array<String>) {
    var name: String? = "Hermione Granger"
    println(formatName(name))
    println(formatName(null))
}

fun formatName(name: String?): String? {
    return name?.toUpperCase()
}