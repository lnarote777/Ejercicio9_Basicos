fun main(){

    try {
        menu()
        val opcion = pedirOpcion()

    }

}
fun menu(){
    println("1. Agregar tarea.")
    println("2. Eliminar tarea.")
    println("3. Mostrar tareas.")
    println("4. Cambiar estado tarea.")
    println("5. Mostrar tareas pendientes.")
    println("6. Mostrar tareas finalizadas.")
    println("0. Salir.")
}

fun pedirOpcion(): Int {
    print("Seleccione una opción -> ")
    val opcion = readln().toInt()
    return opcion
}