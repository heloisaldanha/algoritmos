package fundamentos

fun main() {
    val a = "abc"
    val isString = if (a !is String) "é string" else "não é string"

    val um = 1
    val isInt = if (um is Int) "é um int" else "não é um int"

    // não é igual = !is
    // é igual = is

    println(isString)
    println(isInt)
}