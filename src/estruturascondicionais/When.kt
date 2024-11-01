package estruturascondicionais

fun main() {
    val month = 2

//    val name = when (month) {
//        1 -> "Janeiro"
//        2 -> "Fevereiro"
//        3 -> "Março"
//        else -> "Mês inválido"
//    }

    val name = when  {
        month == 1 -> "Janeiro"
        month == 2 -> "Fevereiro"
        month == 3 -> "Março"
        else -> "Mês inválido"
    }

    println(name)
}