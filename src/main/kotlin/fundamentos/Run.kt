package fundamentos

data class Pessoa(
    var nome: String? = null,
    var idade: Int? = null
)

fun main() {
    val pessoa = Pessoa()

    pessoa.run {
        pessoa.nome = "Heloísa"
        pessoa.idade = 35
    }.apply { println(pessoa) }

}