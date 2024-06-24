//The functions here are not enclosed in a class
//These are free functions
//Top Level functions

//fun getGreeting(): String? {
//    return "Hello Kotlin"
//}//? can return null, functions support type inference

//single expression function, type inference so we can remove return type
//fun getGreeting():String = "Hello Kotlin"

//Unit in kotlin is absence of any useful type
//This returns nothing useful
//fun sayHello(): Unit{
//    println(getGreeting())
//}

//fun sayHello(itemToGreet: String){
//    //val msg = "Hello "+ itemToGreet
//
//    //string Template
//    val msg = "Hello $itemToGreet"
//    println(msg)
//}

//Single expression
fun sayHello(greeting:String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main(){
//    println(getGreeting())
//    println("Hello World")
//    sayHello()

    sayHello("Hey","Palveet")
    sayHello("Hello","Simran")
}