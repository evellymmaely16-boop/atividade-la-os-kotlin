fun main() {
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana")
    val idades = listOf(17, 21, 15, 30)
    for (i in nomes.indices) {
        val classificacao = when {
            idades[i] < 18 -> "Acesso Negado (Menor de idade)"
            idades[i] <= 25 -> "Acesso Permitido (Perfil Jovem)"
            else -> "Acesso Permitido (Perfil Sênior)"
        }
        println("${nomes[i]}: $classificacao")
    }
}
