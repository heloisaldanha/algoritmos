package fundamentos

fun imprimirSituacao(x: Any) {
    when(x as? Int ?: 6) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1 -> println("E")
        else -> println("Nota inválida")
    }
}

fun main() {
    val notas = listOf(10.0, 7.6, 6.5, 1.0, 2.2, 4.2)
    for (nota in notas) {
       // imprimirSituacao(nota) ---- erro
        imprimirSituacao(nota)
    }
}