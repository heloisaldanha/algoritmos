package fundamentos

class Calculadora{

    // chamadas encadeadas. o this mostra que ela vai retornar a própria classe


    private var resultado = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(numero: Int): Calculadora {
        resultado *= numero
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun print() : Calculadora {
        println(resultado)
        return this
    }

    fun obetrResultado(): Int {
        return resultado
    }
}

fun main() {
    val calculadora = Calculadora()
    calculadora.somar(5, 6, 7, 8, 9).print().multiplicar(2).print()
    calculadora.somar(2, 3, 4, 5).print().limpar()
    println(calculadora.obetrResultado())
}
