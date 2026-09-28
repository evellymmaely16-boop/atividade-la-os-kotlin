fun main() {
    val n = 5
    for (linha in 1..n) {
        for (coluna in 1..n) {
            if (linha == coluna)
                print("X ")
            else
                print("* ")
        }
        println()
    }
}
