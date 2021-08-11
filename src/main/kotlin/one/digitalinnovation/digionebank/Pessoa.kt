package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Otávio"
    var cpf: String = "132.123.123-22"
}
fun main() {
    val otavio = Pessoa()

    println(otavio.nome)
    println(otavio.cpf)
}