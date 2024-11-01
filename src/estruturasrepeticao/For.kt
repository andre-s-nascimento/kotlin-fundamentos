package estruturasrepeticao

fun main() {
    for (x in 0..<10) {
        println(x)
    }
    println("--")
    for (x in 10 downTo 0) {
        println(x)
    }
    println("--")
    for (x in 1..10 step 2) {
        println(x)
    }
}