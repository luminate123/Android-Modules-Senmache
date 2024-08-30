# Codigos de los CodLabs de Introduccion a Kotlin

Se opto por un reame.md para que se pueda copiar y pegar los codigos de manera mas facil

## CodLab1 - Tu primer programa en kotlin
  ```bash
    fun main() {
        println("Hello, Android!")
    }
  ```

### Ejercicio 1
  ```bash
fun main() {
    println("I'm")
    println("learning")
    println("Kotlin!")
}
  ```

### Ejercicio 2
  ```bash
fun main() {
    println("I'm")
    println("learning")
    println("Kotlin!")
}
  ```
### Ejercicio 3
  ```bash
fun main() {
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")
}
  ```
### Ejercicio 4
  ```bash
fun main() {
    println("Tomorrow is rainy")
}
  ```
### Ejercicio 5
  ```bash
fun main() {
    println("There is a chance of snow")
}
  ```
### Ejercicio 6
  ```bash
fun main() {
    println("Cloudy")
    println("Partly Cloudy")
    println("Windy")
}
  ```
### Ejercicio 7
  ```bash
fun main() {
    println("How's the weather today?")
}
  ```


## CodLab2 - Crea y usa variables en Kotlin

## CodLab3 - Cómo crear y usar funciones en Kotlin

## CodLab4 - Problemas prácticos: Conceptos básicos de Kotlin
### Ejercicio 1 - Impresión de mensajes
  ```bash
fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}
  ```


### Ejercicio 2 - Corrección de un error de compilación
  ```bash
fun main() {
    println("New chat message from a friend")
}
  ```

### Ejercicio 3 - Plantillas de strings
  ```bash
fun main() {
    println("How's the weather today?")
}
  ```
}
### Ejercicio 4 - Concatenación de strings
  ```bash
fun main() {
    println("How's the weather today?")
}
  ```

### Ejercicio 5 - Formato de mensajes
  ```bash
fun main() {
    println("How's the weather today?")
}
  ```

### Ejercicio 6 - Implementación de operaciones matematicas
  ```bash
fun main() {
    println("How's the weather today?")
}
  ```

### Ejercicio 7 - Parámetros predeterminados
  ```bash
fun main() {
    println("How's the weather today?")
}
  ```

### Ejercicio 8 - Podómetro
  ```bash
fun main() {
    val pasos = 4000
    val caloriasquemadas = MetrosPasosCalorias(pasos);
    println("Walking $pasos steps burns $caloriasquemadas calories")
}

fun MetrosPasosCalorias(numeroPasos: Int): Double {
    val CaloriasporPaso = 0.04
    val Total = numeroPasos * CaloriasporPaso
    return Total
}
  ```

### Ejercicio 9 - Comparación de dos numeros 
  ```bash
fun main() {
    println("${comparaciontiempo(300, 250)}")
    println("${comparaciontiempo(300, 300)}")
    println("${comparaciontiempo(200, 220)}")
}

fun comparaciontiempo(tiempohoy: Int, tiempoayer: Int): Boolean {
    return tiempohoy > tiempoayer
}
  ```

### Ejercicio 10 - Movimiento del código duplicado a una función
  ```bash
fun main() {
	escribirclimaciudad("Ankara",27,31,82)
    escribirclimaciudad("Tokyo",32,36,10)
    escribirclimaciudad("Ankara",59,64,2)
    escribirclimaciudad("Ankara",50,55,7)
}

fun escribirclimaciudad(nombre:String,temperaturabaja:Int,temperaturaalta:Int,rain:Int){
    println("City: $nombre")
    println("Low temperature: $temperaturabaja, High temperature: $temperaturaalta")
    println("Chance of rain:: $rain%")
    println()
}
  ```
