/**
 * Created by Abir on 26-May-17.
 */
fun main(args: Array<String>) {

    println("With new line")
    print("Hello Abir, Welcome to kotlin!")
    println()

    val exampleObject = BasicExamples() // No 'new' to create a object

    exampleObject.variableType1()
    exampleObject.variableType2()

    exampleObject.nullExample2("Abir")
    exampleObject.nullExample2(null)

    exampleObject.nullExample3("Elvis")
    exampleObject.nullExample3(null)
}

