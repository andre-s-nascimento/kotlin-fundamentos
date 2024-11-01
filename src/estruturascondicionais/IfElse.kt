package estruturascondicionais

fun main() {
    val age = readln().toInt()

    //kotlin usa if como retorno para uma variavel.
    //val message = if (age >= 18) "Você pode tirar a carteira de motorista"
    //else if (age >= 16) "Você não pode tirar a carteira de motorista, mas já pode votar"
    //else "Você não pode tirar a carteira de motorista"

    val message = if (age >= 18) {
        "Você pode tirar a carteira de motorista"
    } else if (age >= 16) {
        "Você não pode tirar a carteira de motorista, mas já pode votar"
    } else {
        "Você não pode tirar a carteira de motorista"
    }

    println(message)
}