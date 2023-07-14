package com.Marllydpv.condicionales

class Condicionales {

}


fun main (){
    /*
    val guests = 30
    if (guests == 0) {
        println("No guests")
    } else if (guests < 20) {
        println("Small group of people")
    } else {
        println("Large group of people!")
    }
*/
    /*
       print("ingrese un numero del 1 al 20")
    val number = 50
    if (number in 1..20)
        {
        print ("el numero esta en el rango")
    }
    else {
        print("te dije un numero del 1 al 20")
    }
*/

/*
    var results=(0..20).random()

    when (results) {
        0 -> println("No hay coincidencias")
        in 1..10 -> println(" hay 10 coincidencias")
        in 1..20 -> println(" hay muchas coincidencias")
           }

*/
    var results=(1..4).random()
    when (results){
        1 -> println("sacaste la bolita roja,obtienes un 10%")
        2 -> println("sacaste la bolita azul,obtienes un 30%")
        3 -> println("sacaste la bolita amarilla,obtienes un 50%")
        4 -> println("sacaste la bolita blanca,obtienes tu compra gratis")

    }


    }

}