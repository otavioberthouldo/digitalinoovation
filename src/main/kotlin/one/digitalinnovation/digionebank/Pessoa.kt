package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Otávio"
    var cpf: String = "123.456.789-12"
    private set

    constructor()

    fun pessoaInfo() ="$nome e $cpf"
}

fun main() {
    val otavio = Pessoa()

    println(otavio.pessoaInfo())

}