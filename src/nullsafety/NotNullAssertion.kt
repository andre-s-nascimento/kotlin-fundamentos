package nullsafety

fun main(){
    val name: String? = "André Nascimento"
    val reversed = name!!.reversed() // Não recomendado, basicamente quebra o propósito do Kotlin

    println(reversed)
}