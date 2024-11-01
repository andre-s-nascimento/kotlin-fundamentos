package collections

fun main() {
    // Array Estrutura de dados
    // numero fixo de valores do mesmo tipo
    // [] [] [] []
    // 0  1  2  3
    val a = arrayOf("A", "B", "C", "D")

    println(a.contentToString())

    println(a[0])
    println(a[3])
    //println(a[5])
    //println(a[-1])

    a[1] = "E"
    println(a.contentToString())

    val b = arrayOf(1, 2, 3, 4)
    val c = arrayOf(1, 2, 3, 4)

    println(b.contentToString())
    println(c.contentToString())

    println(b == c)
    println(b.contentEquals(c))

    val d = doubleArrayOf(1.0, 2.0, 3.0)
    val result = sum(*d)
    println(result)
}

private fun sum(vararg values: Double): Double {
    var acc: Double = 0.0
    for (value in values) {
        acc += value
    }
    return acc
}