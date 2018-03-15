package hms.tecktalks.kotlinvsjava.kotlin

fun main(args: Array<String>) {
    var notNullValue: String
    //Compilation error
//    notNullValue = null
    var nullableValue: String? = null

    println("Nullable [$nullableValue]")

    println("Length [${nullableValue?.length}]")

    nullableValue = "Hello"

    println("Length [${nullableValue?.length}]")

    //Elvis Operator

    nullableValue = null

    val length: Int? = nullableValue?.length

    println("Length [${length}]")

    println("Length [${length ?: 0}]")

    //for NPE lovers

    println("NPE ${nullableValue!!}")


}