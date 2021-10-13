package examen1


fun main(){

    //Estas variables las utilizaré para salir de los bucles que te preguntan el nombre y el mes
    //Los bucles de nombre y mes los utilizaré para asegurarme que el input sea correcto
    var check : Int = 1
    var check2: Int = 1


    var edad: Int = 0
    var mes: Int = 0

    println("*".repeat(80))
    println("PROGRAMA DE GENERACIÓN DE TABLAS: Ricardo Gallego Domínguez")
    println("*".repeat(80))

    //Pregunto la edad y convierto el String del readLine() a un Int

    while(check==1) {

        print("Introduzca la edad: ")
        edad = Integer.valueOf(readLine())

        if (edad in (6..12)){
            check = 0
        }
        else {
            println("Esa edad no se contempla, por favor introduzca una edad entre 6 y 12")
        }

    }
    println("")

    //Pregunto el mes y convierto el String del readLine() a un Int
    while(check2==1) {

        print("Introduzca el mes: ")
        mes = Integer.valueOf(readLine())

        if (mes in (1..12)){
            check2 = 0
        }
        else {
            println("Este mes es erroneo, introduzca uno entre 1 y 12")
        }

    }


    /*
    Uso un when con los rangos pedidos, dentro de los rangos se preguntará si el mes es par o impar
    el cual determinará que tabla se mostrará
     */

    when (edad){

        in (6..8) ->
        {
            println("-".repeat(80))
            println("Edad $edad, el alumno está dentro del rango [6,8]")

            if (mes % 2 == 0) {

                println("Como el mes $mes es par le corresponden las tablas {2,4}")
                println("-".repeat(80))

                println("")
                println("************")
                println("TABLA DEL 2")
                println("************")

                for (i in 1..10) {
                    val product = 2 * i
                    println("2 * $i = $product")
                }
                println("************")
                println("TABLA DEL 4")
                println("************")
                for (i in 1..10) {
                    val product = 4 * i
                    println("4 * $i = $product")
                }
                println("************")

            }

            else{

                println("El mes $mes es impar y le corresponden las tablas {1,3,5}")
                println("-".repeat(80))

                println("")
                println("************")
                println("TABLA DEL 1")
                println("************")

                for (i in 1..10) {
                    val product = 1 * i
                    println("1 * $i = $product")
                }

                println("************")
                println("TABLA DEL 3")
                println("************")
                for (i in 1..10) {
                    val product = 3 * i
                    println("3 * $i = $product")
                }
                println("************")
                println("TABLA DEL 5")
                println("************")
                for (i in 1..10) {
                    val product = 5 * i
                    println("5 * $i = $product")
                }
                println("************")
            }

        }
        in (8..10) -> {

            println("-".repeat(80))
            println("Edad $edad, el alumno está dentro del rango [8,10]")

            if (mes % 2 == 0) {

                println("Como el mes $mes es par le corresponden las tablas {6,8,10}")
                println("-".repeat(80))

                println("")
                println("************")
                println("TABLA DEL 6")
                println("************")

                for (i in 1..10) {
                    val product = 6 * i
                    println("6 * $i = $product")
                }

                println("************")
                println("TABLA DEL 8")
                println("************")
                for (i in 1..10) {
                    val product = 8 * i
                    println("8 * $i = $product")
                }
                println("************")
                println("TABLA DEL 10")
                println("************")
                for (i in 1..10) {
                    val product = 10 * i
                    println("10 * $i = $product")
                }
                println("************")

            }

            else{

                println("El mes $mes es impar y le corresponden las tablas {7,9}")
                println("-".repeat(80))

                println("")
                println("************")
                println("TABLA DEL 7")
                println("************")

                for (i in 1..10) {
                    val product = 1 * i
                    println("7 * $i = $product")
                }
                println("************")
                println("TABLA DEL 9")
                println("************")
                for (i in 1..10) {
                    val product = 9 * i
                    println("9 * $i = $product")
                }
                println("************")

            }

        }


        in (10..12) ->

        {

            println("-".repeat(80))
            println("Edad $edad, el alumno está dentro del rango [10,12]")
            println("Tanto a los meses impares y pares se les asignará las mismas tablas, es decir, las tablas {11,12,13}")
            println("-".repeat(80))

                println("")
                println("************")
                println("TABLA DEL 11")
                println("************")

                for (i in 1..10) {
                    val product = 11 * i
                    println("11 * $i = $product")
                }

                println("************")
                println("TABLA DEL 12")
                println("************")
                for (i in 1..10) {
                    val product = 12 * i
                    println("12 * $i = $product")
                }
                println("************")
                println("TABLA DEL 13")
                println("************")
                for (i in 1..10) {
                    val product = 13 * i
                    println("13 * $i = $product")
                }
                println("************")

            }

    }

    println("-".repeat(80))

}