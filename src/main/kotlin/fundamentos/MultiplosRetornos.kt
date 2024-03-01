package fundamentos

import java.time.LocalDateTime
import java.util.Calendar
import kotlin.math.min

data class Horario(
    val hora: Int,
    val minuto: Int,
    val segundo: Int
    )

fun agora(): Horario {
    val agora = Calendar.getInstance()

    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main() {
    val (hora, minuto, segundo) = agora()
    println("$hora:$minuto:$segundo")
}