package collections

fun main() {

//espera o tipo da variável, tamanho e inicialização
    //ele infere pelo tipo da inicialização

    val nomes = Array(5) { "" }
    nomes[0] = "Janaina"
    nomes[1] = "Juliana"
    nomes[2] = "Jandira"
    nomes[3] = "Jenifer"
    nomes[4] = "Jacira"

    for (nome in nomes) {
        println(nome)
    }

    println("")

    nomes.sort()
    nomes.forEach { println(it) }

    //declara na criação da array
    val nomes2 = arrayOf("Amanda", "Adriana", "Amélia", "Aline", "Alana")

    println("")

    nomes2.sort()
    nomes2.forEach { println(it) }

}