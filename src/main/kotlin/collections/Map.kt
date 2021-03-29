package collections

fun main() {

    //coleção de chaves e valores, pares
    val pair: Pair<String, Int> = Pair("Natalia", 5052)
    val map1 = mapOf(pair)
    map1.forEach { (k, v) -> println("Nome: $k - id: $v") }

    //infix, iteramos usando a sintaxe
    val map2 = mapOf(
        "Andre" to 5051,
        "Marta" to 5050
    )

    map2.forEach { (k, v) -> println("Nome: $k - id: $v") }
}