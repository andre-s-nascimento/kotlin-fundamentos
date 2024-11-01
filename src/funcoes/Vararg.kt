package funcoes

fun main() {

//    val a = sum(1.5, 3.1)
//    println(a)
//    val b = sum(sum(1.5, 3.1), 7.1)
//    println(b)

    val a = sum(1.5, 3.1, 7.2, 1.2)
    println(a)
}

private fun sum(vararg values: Double): Double {
    var acc: Double = 0.0
    for (value in values){
        acc += value
    }
    return acc
}