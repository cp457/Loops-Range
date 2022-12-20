import kotlin.system.exitProcess

fun first (x : Int) {
    println(x)
}

    fun second(y: Int) {
        println(y)
}

    fun main() {

        for (i in 0..100 step 2) {
            when {
                i <= 0 -> println("before ${i} ")
                i <= 49 -> println(i)
                i <= 50 -> println("after${i} ")
                i > 50 -> println("${i} ")
            }
        }
    }








