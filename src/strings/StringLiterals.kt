package strings

fun main() {
    /*
    Uma string
    com multiplas
    linhas
     */
    //val message = "Uma string\ncom multiplas\nlinhas "
    val message = """
        Uma string 
          com multiplas
        linhas
    """.trimIndent()
    println(message)

    val name = "André"
    val message2 = """
        *Uma string 
        *  com multiplas \n
        *linhas $name
    """.trimMargin("*")
    println(message2)
}