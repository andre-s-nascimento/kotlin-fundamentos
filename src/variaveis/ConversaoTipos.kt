package variaveis

fun main() {
    val int1 = 10
    val long1 = int1.toLong()

    println(int1)
    println(long1)

    val double1 = int1.toDouble()

    println(double1)

    val double2 = 25.71
    val int2 = double2.toInt()

    println(double2)
    println(int2)

    val int3 = 10000
    val byte1 = int3.toByte()

    println(int3)
    println(byte1)

    val string1 = int1.toString()
    val string2 = "101"
    val int4 = string2.toInt()

    println(string1)
    println(int4)
}