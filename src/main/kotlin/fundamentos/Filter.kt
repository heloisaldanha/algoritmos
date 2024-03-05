package fundamentos

data class Alunos(
    val nome: String,
    val nota: Double
)

fun main() {
    val alunos = listOf(
        Alunos("Pedro", 8.0),
        Alunos("Paula", 9.0),
        Alunos("Thiago", 3.5),
        Alunos("Gabriela", 1.0),
        Alunos("Diana", 7.0),
        Alunos("Gustavo", 8.8)
    )

    print(alunos.filter { it.nota >= 7.0 }.sortedBy { -it.nota })  // pega nota do maior para o menor
}