package strings

fun main() {
    val name = "André Nascimento"

    println(name.reversed())
    println(name.lowercase())
    println(name.uppercase())
    println(name.equals("André Nascimento"))
    println(name.slice(0..2))
    println(name.length)
    println(name[4])
    println(name.startsWith("And"))
    println(name.endsWith("ento"))

}