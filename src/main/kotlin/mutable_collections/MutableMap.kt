package mutable_collections

import collections.Funcionario

fun main() {

    val joao = Funcionario("Joao", 3500.00, "CLT")
    val pedro = Funcionario("Pedro", 5000.00, "CLT")
    val maria = Funcionario("Maria", 8000.00, "PJ")
    val julia = Funcionario("Julia", 3000.00, "CLT")
    val fabio = Funcionario("Fabio", 2900.00, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
}