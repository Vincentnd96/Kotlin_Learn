
val name = "Vincent"
var greeting: String? = "hello"

fun main() {
    println(greeting)
    println(name)

    greeting = null
    println(greeting)
    println(name)

        if(greeting != null){
            println(greeting)
            println(name)
    } else{
        println("Default Greeting for " + name)
    }

    when(greeting){
        null -> println("You got nulled")
        else -> println("You got the default")
    }
    println(name)

    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)

    val greetingToPrint2 = when(greeting){
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint2)
}

