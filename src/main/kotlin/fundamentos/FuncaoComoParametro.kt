class Operacao {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun calcular(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}

fun main() {
    println(calcular(1, 2, Operacao()::somar)) // quando a função vem dentro de outra classe, chama a classe()
    println(calcular(4, 5, ::somar)) // quando a função é top level, não tem necessidade de passar a classe, chama a função diretamente
}