fun main() {
    // Lista predefinida de alimentos y sus calorías
    val alimentos = mapOf(
        "Pizza" to 800,
        "Ensalada" to 200,
        "Hamburguesa" to 700,
        "Manzana" to 100,
        "Helado" to 300,
        "Pasta" to 600,
        "Yogurt" to 150
    )

    // Mostrar la lista de alimentos y sus calorías
    println("Lista de alimentos y sus calorías:")
    alimentos.forEach { (alimento, calorias) ->
        println("$alimento: $calorias calorías")
    }

    // Separar los alimentos en dos categorías
    val altosEnCalorias = alimentos.filter { it.value > 500 }
    val bajosEnCalorias = alimentos.filter { it.value <= 500 }

    // Calcular el total de calorías consumidas
    val totalCalorias = alimentos.values.sum()

    // Mostrar los alimentos de cada categoría
    println("\nAlimentos altos en calorías (más de 500):")
    altosEnCalorias.forEach { (alimento, calorias) ->
        println("$alimento: $calorias calorías")
    }

    println("\nAlimentos bajos en calorías (500 o menos):")
    bajosEnCalorias.forEach { (alimento, calorias) ->
        println("$alimento: $calorias calorías")
    }

    // Mostrar el total de calorías consumidas
    println("\nTotal de calorías consumidas: $totalCalorias")

    // Mostrar la cantidad de alimentos altos en calorías
    println("Cantidad de alimentos altos en calorías: ${altosEnCalorias.size}")
}
