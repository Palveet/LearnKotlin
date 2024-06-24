//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
var name:String = "Palveet" //top level variable + non null string
//var lastName:String?=null //nullable string
var greeting: String? = null //nothing type, non inferable
fun main() {
//    val lang = "Kotlin" //inmmutable variable
//    name = "Simran"
//    println("Hello, " + lang + "!")
//    println("Hello, " + name + "!")
//    println(lastName)
    greeting = "Hello"
//    if(greeting != null){
//        println(greeting)
//    } else {
//        println("Hi")
//    }
    //when similar to switch
//    when(greeting){
//        null -> println("Hi")
//        else -> println(greeting)
//    }
//    println(name)

    //assigning value using if else
    //val greetingToPrint = if(greeting!=null) greeting else "hi"

   //assigning value using when
    val greetingToPrint = when(greeting){
        null -> "hi"
        else -> greeting
    }
    println(greetingToPrint)
}