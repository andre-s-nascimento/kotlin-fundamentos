package nullsafety

fun main() {
    val name: String? = "André Nascimento"
    //val length = if (name != null) name.length else 0
    val length = name?.length ?: 0
    println(length)
}