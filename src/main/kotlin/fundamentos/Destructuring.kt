package fundamentos

data class Carro(val marca: String, val modelo: String, val ano: Int)

fun main() {
    val (marca, modelo, ano) = Carro("Chevorlet", "Prisma", 2020)
    println("$marca - $modelo - $ano")

    val (gato, cor, peso) = listOf("Elvis", "amarelo", 8.8)
    println("$gato - $cor - ${peso}kg")

    val (_, _, _, quartoLugar) = listOf("primeiro", "segundo", "terceiro", "quarto")

    println(quartoLugar)
}