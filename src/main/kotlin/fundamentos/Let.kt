package fundamentos

fun main() {
    val letras = listOf("A", null, "B", null, "C", null)

    letras.map { it?.let { println(it) } }  // iterou por cima dos valores válidos e os devolveu
}