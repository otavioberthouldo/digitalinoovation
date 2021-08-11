package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Otávio"

    var cpf: String = "108.711.236-22"
    private set

}

fun main() {
    val otavio = Pessoa()

    println(otavio)
    println(otavio.nome)
    println(otavio.cpf)

}