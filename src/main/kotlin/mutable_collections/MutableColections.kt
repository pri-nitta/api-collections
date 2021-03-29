package mutable_collections

import collections.Funcionario

fun main (){

    //mutable é pq conseguimos alterar
    val joao = Funcionario("Joao", 3500.00, "CLT")
    val pedro = Funcionario("Pedro", 5000.00, "CLT")
    val maria = Funcionario("Maria", 8000.00, "PJ")
    val julia = Funcionario("Julia", 3000.00, "CLT")
    val fabio = Funcionario("Fabio", 2900.00, "PJ")

    println("===============LIST=================")
    val funcionarios = mutableListOf(joao, maria, julia)
    funcionarios.forEach{println(it)}

    println("")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("===============SET=================")
    //para add, deverá ser criado 1 linha para cada adição.
val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.add(fabio)
    funcionariosSet.add(julia)
    funcionariosSet.forEach{print(it)}

    println("")
    funcionariosSet.remove(joao)
    funcionariosSet.forEach{println(it)}
}