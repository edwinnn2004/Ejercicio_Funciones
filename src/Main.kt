//Nombre: Edwin Felipe Peñuela Forero
fun main() {
    println("Escriba el numero de la operacion que quiere realizar")
    println("\n 1.Suma\n 2.Resta\n 3.Raiz\n 4.Cuadrado\n " +
            "5.Saludo\n 6.Division\n 7.Multiplicacion\n 8.Salir")
    println("Digite: ")
    var operacion = readln().toInt()
    var estado = true
    while (estado) {
        if (operacion == 1) {
            suma()
            estado = false
        } else if (operacion == 2) {
            resta()
            estado = false
        } else if (operacion == 3) {
            println("La raiz es: ${raiz()}")
            estado = false
        } else if (operacion == 4) {
            println(cuadrado())
            estado = false
        } else if (operacion == 5) {
            println(saludo())
            estado = false
        } else if (operacion == 6) {
            division(8.0, 2.0)
            estado = false
        } else if (operacion == 7) {
            println(multi(8.0, 2.0))
            estado = false
        } else if (operacion == 8) {
            println("Haz salido")
            estado = false
        }
    }
}
    var n1 = 8.0
    var n2 = 2.0
//Sin parametros y sin retorno
fun suma() {
    println("La suma es: ${n1+n2}")
}
fun resta() {
    println("La resta es: ${n1-n2}")
}
//Sin parametros y con retorno
fun raiz():Double{
    return Math.sqrt(n1)
}
fun saludo(): String{
    return "hola clase"
}
fun cuadrado(): Double{
    return Math.pow(n1, 2.0)
}
//Con parametros y sin retorno
fun division(n1: Double, n2: Double){
    var div= n1/n2
    println("La division es: ${div}")
}
//Con parametros y con retorno
fun multi(n1:Double, n2:Double):String {
    return "La multiplicacion es: ${(n1*n2)}"
}