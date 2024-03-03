package fundamentos

class Data(
    var dia: Int,
    var mes: Int,
    var ano: Int
) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    val nascimento = Data(dia = 28, mes = 5, ano = 1989)
    val nascimento2 = Data(31, 8, 1985)
    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    println(nascimento.formatar())
    println(nascimento2.formatar())
}