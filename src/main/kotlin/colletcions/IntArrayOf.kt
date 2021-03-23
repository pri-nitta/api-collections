package colletcions

fun main() {

    //int array of não precisa delimitar o tamanho na instanciação
    //inicializamos o array e passamos os valores
    val values2 = intArrayOf(2,6,8,10,4)

    values2.forEach{
        println(it)
    }

    println("")
    values2.sort()
    values2.forEach{
        println(it)
    }
}