package collections

fun main() {
    val list1 = listOf("A", "B", "C")

    println(list1)

    println(list1[0])
    //println(list1[5])

    for (i in list1){
        println(i)
    }

    val mutableList1 = mutableListOf("A","B","C")
    println(mutableList1)

    println(mutableList1[0])
    //println(mutableList1[5])

    for (i in mutableList1){
        println(i)
    }

    mutableList1.add("D")

    println(mutableList1)

    mutableList1.add(0, "E")

    println(mutableList1)

    mutableList1.removeAt(0)
    println(mutableList1)

    mutableList1[2] = "G"

    println(mutableList1)
}