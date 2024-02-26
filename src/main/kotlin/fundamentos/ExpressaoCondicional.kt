package fundamentos

fun main() {
    val num1 = 1
    val num2 = 2

    val maiorValor = if (num1 > num2){
        println("Entrou no if:")
        num1
    } else {
        // se o num2 ficar aqui, dá erro
        println("Entrou no else:")
        // a última linha da expressão é o resultado do retorno
        num2 // se quero retornar esse valor, então ele deve ser escrito por último

    }

    println(maiorValor)
}