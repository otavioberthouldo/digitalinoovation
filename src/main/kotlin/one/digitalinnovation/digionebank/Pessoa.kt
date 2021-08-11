package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Otávio"
    var cpf: String = "108.711.236-22"
    private set

    constructor()

    fun pessoaInfo() ="$nome e $cpf"
}

fun main() {
    val otavio = Pessoa()

    println(otavio.pessoaInfo())

}