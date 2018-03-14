package hms.tecktalks.kotlinvsjava.kotlin

fun main(args: Array<String>) {
    for(i in 1..10){
        println("loop1 $i")
    }

    for(i in 1 until  10){
        println("loop2 $i")
    }

    for(i in 1 until  20 step 2){
        println("loop3 $i")
    }
}