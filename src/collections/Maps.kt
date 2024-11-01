package collections

fun main() {

    val map1 = mapOf("nome" to "André", "cidade" to "Praia Grande")
    println(map1)

    println(map1["nome"])
    println(map1["cidade"])
    //println(map1["telefone"])

    val mutableMap1 = mutableMapOf("nome" to "André", "cidade" to "Praia Grande")
    println(mutableMap1["nome"])
    println(mutableMap1["cidade"])

    mutableMap1["nome"] = "Kalel"
    println(mutableMap1)

    mutableMap1.put("telefone", "11992730482")
    println(mutableMap1)

    mutableMap1["email"] = "andre@andrenascimento.com"
    println(mutableMap1)

    for (i in mutableMap1) {
        println("chave=${i.key} // valor=${i.value}")
    }

}