package fundamentos

import java.math.RoundingMode

data class Mercado(
    val nome: String,
    val preco: Double
)

fun main() {
    val produtos = listOf(
        Mercado("Arroz", 4.99),
        Mercado("Feijão", 10.00),
        Mercado("Macarrão", 3.99),
        Mercado("Açúcar", 4.00)
    )

    // função lambda que vai somar todos os produtos
    val totalizando = {total: Double, atual: Double -> total + atual}

    // vai percorrer todos os preços, depois vai chamar a função de somar
    val precoTotal = produtos.map { it.preco }.reduce(totalizando)

    println(precoTotal)
    // vai pegar o preço total e dividir pelo tamanho de produtos
    println("O preço médio da feira é R$${(precoTotal / produtos.size).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()}") // duas casas decimais
}