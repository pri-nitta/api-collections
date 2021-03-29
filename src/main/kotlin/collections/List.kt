package collections

fun main() {
    val joao = Funcionario("Joao", 3500.00, "CLT")
    val pedro = Funcionario("Pedro", 5000.00, "CLT")
    val maria = Funcionario("Maria", 8000.00, "PJ")
    val julia = Funcionario("Julia", 3000.00, "CLT")
    val fabio = Funcionario("Fabio", 2900.00, "PJ")

    val funcionarios = listOf(joao, pedro, maria, fabio, julia)
    funcionarios.forEach { println(it) }

    println("")

    println(funcionarios.find { it.nome == "Maria" })

    println("")

    //ordenar por uma variavel
    //foreach tem a responsabilidade de finalizar as operações atreladas à coleção
    funcionarios.sortedBy { it.salario }.forEach { (println(it)) }

    println("")

    //agrupar
    funcionarios
        .groupBy {it.contratacao}
        .forEach { (println(it)) }
}
