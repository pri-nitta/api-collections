package mutable_collections

//quando a classe recebe T quer dizer que é genérica.
//simular um banco de dados para ver o mutable map em ação

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    //criar algo dentro de T
    fun create(id: String, value: T){
        map[id] = value
    }

    //dado uma chave ele dá o valor
    fun findById(id: String) = map[id]
}