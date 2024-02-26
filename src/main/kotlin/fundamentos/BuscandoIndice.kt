package fundamentos

fun main() {
    val alunos = listOf("João", "Maria", "Francisco", "Ana")
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}