package hms.tecktalks.kotlinvsjava.kotlin

fun String.capitalize(): String {
    return this.toUpperCase()
}

fun main(args: Array<String>) {
   println("Harry Potter".capitalize())
}