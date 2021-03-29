package collections

fun main (){
    val salarios = doubleArrayOf(2000.00, 3650.00, 8000.00, 5000.00, 6950.00, 23000.00,15500.00)

    for (salario in salarios){
        println(salario)
    }

    println("")

    println("Maior salário é: ${salarios.maxOrNull()}")
    println("Menor salário é: ${salarios.minOrNull()}")
    println ("A média salarial é: ${salarios.average()}")

    println("")

    //filtro: passar um predicado, se a expressao for verdade, ele filtra
    val salariosFilter = salarios.filter { it > 6000.00 }
    salariosFilter.forEach{println(it)}

    println("")

    //conta quantas posições estão dentro da condição
    println(salarios.count{it in 5000.00 .. 10000.00})


    println("")

    //quero o elemento que fosse exatamente do valor informado
    println(salarios.find{it == 6950.00 }) //retorna o valor
    println(salarios.find{it == 16000.00}) //printa null caso não encontre

    println("")

    //procura dentro da coleção o elemento, retorna boolean
    println(salarios.any{it == 6950.00 })
    println(salarios.any{it == 16000.00})
}