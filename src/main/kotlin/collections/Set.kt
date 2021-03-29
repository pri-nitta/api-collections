package collections

fun main(){
    val laura = Funcionario("Laura", 3500.00, "CLT")
    val pedro = Funcionario("Pedro", 5000.00, "CLT")
    val maria = Funcionario("Maria", 8000.00, "PJ")
    val julia = Funcionario("Julia", 9000.00, "CLT")
    val fabio = Funcionario("Fabio", 2900.00, "PJ")

    //separar em grupos
    val gerentes = setOf(maria, julia)
    val analistas = setOf(laura,pedro,fabio)

    //unir grupos
    val uniao = gerentes.union(analistas)
    uniao.forEach{println(it)}

    println("")

    //retira os grupos, só subtrai o que tiver no grupo
    val projetoA = setOf(julia, laura, pedro)
    val atualizacao = projetoA.subtract(analistas)
    println("Quem é a gerente responsável pelo projeto A?")
    atualizacao.forEach{println(it)}

    println("")

    //intersecção, o que tem de comum entre os grupos
    val comum = projetoA.intersect(analistas)
    println("Quem são os analistas do Projeto A?")
    comum.forEach{println(it)}
}