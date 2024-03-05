package fundamentos

class Calcular {
    var resultado = 0

    fun somar(num1: Int, num2: Int) {
        resultado += num1 + num2
    }

    fun add(num1: Int) {
        resultado += num1
    }
}

fun main() {
    val calculadora = Calcular()
    calculadora.apply { somar(1, 2) }.apply { add(4) }.apply { println(resultado) }.apply { somar(3, 5) }.apply { println(resultado) }

    // inline function
    with(calculadora) {
        somar(3, 4)
        add(1)
        println(resultado)
    }

    // tudo foi somado. Saída -> 7.. 15.. 23
    // ele encadeia várias chamadas em cima de um objeto
}