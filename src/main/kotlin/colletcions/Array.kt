package colletcions

fun main() {

    //informar o tamanho da array dentro do parênteses
    val values = IntArray(5)

    values[0] = 5
    values[1] = 7
    values[2] = 9
    values[3] = 3
    values[4] = 1

    for (valor in values){
        println(valor)
    }

    println ("----------------------------------------")

    //recurso lambda: A cada interação do valor do escopo do for each
    //há como renomear o it ex: valor -> println (valor)
    values.forEach{
        println(it)
    }

    println ("----------------------------------------")

    //iterar sobre os indices do array. Passar o array em si e o indice
    for (index in values.indices){
        println(values[index])
    }

    println ("----------------------------------------")

    //antes de iniciar a impressão da nova interação, chamamos um recurso chamado sort,
    //que ordenou do maior para o menor.
    values.sort()
    for (valor in values){
        println(valor)
    }

}