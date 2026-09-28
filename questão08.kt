fun main() {
    val pratos = listOf("Pizza", "Hambúrguer", "Lasanha", "Sushi")
    val itemEsgotado = "Pizza"
    for (item in pratos) {
        if (item == itemEsgotado) continue
        println("Item disponível: $item")
    }
}
