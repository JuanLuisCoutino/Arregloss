var arregloNumeros = arrayOf(5, 6, 1 , 7, 3, 8)
println("imprime la posicion 2 = ${arregloNumeros[2]}")
println("Indices = ${arregloNumeros.indices}")
for (i in arregloNumeros.indices){
    println("Elemento ${i}=${arregloNumeros[i]}")
}