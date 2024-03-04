package fundamentos

fun main() {
    val soma = { x: Int, y: Int -> x + y}
    val subtracao = { a: Int, b: Int ->
        a - b
        a + b // a última coisa que for passada pelo lambda, vai ser processada. nesse caso, ele vai passar uma adição ao invés de subtrair
    }
    println(soma(1, 2))
    println(subtracao(5, 3))  // o que era pra ser 2, vai retornar 8
}