fun main() {
    val depositos = listOf(100.0, 150.0, 200.0, 100.0, 50.0)
    var saldo = 0.0
    val meta = 500.0
    for (valor in depositos) {
        saldo += valor
        if (saldo >= meta) {
            println("Meta atingida! Saldo atual: R$ $saldo")
            break
        }
    }
}
