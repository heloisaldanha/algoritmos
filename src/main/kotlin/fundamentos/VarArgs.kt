fun ordenar(vararg numeros : Int, letra: String): List<Any> {
    println(letra)
    return numeros.sorted()
}

fun main() {
    for (numero in ordenar(3332, 5, 6, 3, 7,67, 33, 0, letra = "b")){ // tem que nomear o parâmetro, senão ele irá entender como parte da lista
        print("$numero ")
    }
}