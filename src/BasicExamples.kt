/**
 * Created by Abir on 26-May-17.
 */
class BasicExamples {

    /**
     * In kotlin val works as Immutable objects
     * Similar to java's final objects
     */
    fun variableType1(): Unit {
        val a: Int = 5
        val b = 10
        println("Here A: $a and B: $b")
    }

    /**
     * Example of Mutable objects
     * Which can be re assigned later
     */
    fun variableType2() {
        var a: Int = 100
        var b = 10
        a = 3
        b = 7
        println("Here A: $a and B: $b")
    }

    /**
     * Normally variables or objects in kotlin are non-nullable
     * So we need to use '?' to use or assign a value as NULL
     */
    fun nullExample1() {
        val name: String? = null

        var address: Int?
        address = null

        var newName: String
        //newName = null --> Compilation Error if we try to assign
    }

    /**
     * This method shows if a parameter of a function can be null
     * Then how to apply Safe call using '?.' to avoid Null Pointer Exception(NPE)
     * @see {http://kotlinlang.org/docs/reference/null-safety.html#safe-calls}
     */
    fun nullExample2(x: String?): Unit {
        // val length = x.length --> this could lead to NPE as param type can be NULL, denoted with ?
        // To avoid NPE
        val length = x?.length
        println("String length is: $length")
    }

    /**
     * Example of Elvis Operator '?:'
     * When a object is null then goes to it's right and assign the value
     */
    fun nullExample3(x: String?): Unit {
        val result = x?.length ?: -1
        val text = if (result != -1) "value is $result" else "Null value passed" // Inline If-else
        println(text)
    }
}