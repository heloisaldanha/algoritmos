package fundamentos

import java.util.*

fun main() {
    val data1 = Date(0)
    val data2 = Date(0)

    println("Usando '===': ${data1 === data2}")
    // é falso, pois ele vê que as duas instâncias são diferentes e estão alocadas em endereços diferentes de memória

    println("Usando '==': ${data1 == data2}")
    // é true, pois vê o conteúdo do objeto é igual
}