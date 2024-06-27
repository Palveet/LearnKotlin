//By default collections are immutable in Kotlin

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
    val interestingListMutable = mutableListOf("Kotlin","Programming","Comic Books")
    interestingListMutable.add("Dogs")

    //very similar to array, accessing and printing using loop
//    interestingList.forEach{interestingThing ->
//        println(interestingThing)
//    }

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach{ key,value -> println("$key -> $value")
    }
    val mapMutable = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mapMutable.put(4,"d")
}