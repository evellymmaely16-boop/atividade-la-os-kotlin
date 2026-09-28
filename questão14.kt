fun main() {
    val numero = 6
    var fatorial = 1
    if (numero == 0 || numero == 1) {
        println("Fatorial = 1")
    } else {
        for (i in numero downTo 1) {
            fatorial *= i
        }
        println("Fatorial = $fatorial")
    }
}
