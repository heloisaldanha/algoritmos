package fundamentos

fun main() {
    // while
    // se o número inserido for -1, ele passa pelo while direto, sem entrar
    var opcao: Int? = 0
    while (opcao != 0) {
        println("Escolha um número:")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu o número: $opcao")
    }

    println("Até a próxima - WHILE")

    // do while
    // mesmo que a primeira resposta seja a condição revelada no while, ele vai entrar pelo menos uma vez

    do {
        println("Escolha um número:")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu o número: $opcao")
    } while (opcao != 0)

    println("Até a próxima - DO WHILE")
}