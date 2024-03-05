package fundamentos

fun main() {
    val alunos = listOf("Elvis", "Léia", "Pulguenta", "Ruth&Raquel", "Açucarada", "Algodão sujo")
    val alunosUppercase = alunos.map { it.uppercase() }.apply { println(this) }
    println(alunos)
    println(alunosUppercase)
}