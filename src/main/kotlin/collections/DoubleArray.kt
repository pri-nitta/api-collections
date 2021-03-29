package collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 4000.00
    salarios[1] = 3500.00
    salarios[2] = 6570.00

    salarios.sort()
    salarios.forEach {
        println(it)
    }

    println("")

    //já nos dá o indice
    salarios.forEachIndexed {index, salario ->
salarios[index] = salario * 1.1
    }

    salarios.forEach {println(it)}

    println("")

    //pode indicar os valores
    val salarios2 = doubleArrayOf(5800.00, 9000.00,3700.00,15500.00)
    salarios2.sort()
    salarios2.forEach { println(it) }
}