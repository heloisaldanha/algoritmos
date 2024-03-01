package fundamentos

class Produto(
    val nome: String,
    val preco: Double
)

infix fun Produto.maisCaroQue(preco: Produto) : Boolean = this.preco > preco.preco

fun main() {
    val produto1 = Produto("Ventilador", 200.99)
    val produto2 = Produto(preco = 39.9, nome = "Garrafa")

    println(produto1 maisCaroQue  produto2)
}