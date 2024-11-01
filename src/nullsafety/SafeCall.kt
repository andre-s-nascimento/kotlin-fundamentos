package nullsafety

fun main() {
    var name: String? = "André Nascimento"
    var length = name?.length
    println(length)

    name = null
    length = name?.length
    println(length)

    val name2 = "Andre"
    val length2 = name2.length
    println(length2)

}