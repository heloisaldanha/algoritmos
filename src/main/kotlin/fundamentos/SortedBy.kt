package fundamentos

fun main() {
    val nomes = listOf("Paula", "Marcelo", "Keila", "Amanda", "Cláudio", "Peterson", "Amauri")
    println(nomes.sortedBy { it })  // vai ordenar pela primeira letra
    println(nomes.sortedBy { it.length })  // vai ordenar pela quantidade de letras
    println(nomes.sortedBy { it.reversed() })  // vai inverter a palavra e pegar pela ordem da última letra
    println(nomes.sortedBy { )
}