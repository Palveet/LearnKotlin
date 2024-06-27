fun sayHi(greeting:String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main(){
    val interestingThings = arrayOf("Kotlin","Programming","Comic Books")

//    Array function example
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(1))

//    for loop syntax
//    for(interestingThing in interestingThings){
//        println(interestingThing)
//    }
//    sayHi("Hey","Palveet")
//    sayHi("Hello","Simran")

//    for each loop
//    interestingThings.forEach { interestingThing ->
//        println(interestingThing)
//    }

//    for each index function -> for iterating and maintaining index data

//    interestingThings.forEachIndexed{index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }
    val interestingList = listOf("Kotlin","Programming","Comic Books")

    //very similar to array, accessing and printing using loop
//    interestingList.forEach{interestingThing ->
//        println(interestingThing)
//    }
}