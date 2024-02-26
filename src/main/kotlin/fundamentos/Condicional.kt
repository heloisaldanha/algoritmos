package fundamentos


fun main() {
    for (i in 0..100 step 5){
        //Thread.sleep(1000)
        print("$i ")
    }
    println()
    for (i in 100 downTo 0 step 10) {
        //Thread.sleep(1000)
        print("$i ")
    }
}