package fundamentos

fun main() {
    println("Digite ssua mensagem:")

    val entrada = readLine()
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"

    println(mensagem)
}