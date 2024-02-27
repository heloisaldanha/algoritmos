package fundamentos

fun checando(x: Any) {
    if (x is String){
        println(x.uppercase())
    } else if (x is Int) {
        println(x.dec())
    } else if (x is Double) {
        println(x.plus(4.2))
    }
}

fun checando2(x: Any) {
    when(x) {
        is String -> println(x.lowercase())
        is Int -> println(x.dec())
        is Double -> println(x.plus(10.0))
    }
}

fun main() {
    checando(2)
    checando("Olá")
    checando(3.3)
    checando2(500)
    checando2("Mundo")
    checando2(410.0)
}