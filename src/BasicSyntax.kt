/**
 * Created by dukwonnam on 2017. 7. 3..
 *
 * Reference:
 * - https://kotlinlang.org/docs/reference/basic-syntax.html
 */

fun main(args : Array<String>) {
    println("Hello, world!")
    // Hello, world!

    /*
      Comments basic rule is same as Java
      // But in Kotlin,
      /*
        nested block can be.
        This can't in Java
       */
     */


    /*
      Defining local variables
     */
    // val : Read-only type
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    println("a=$a, b=$b, c=$c")     // a=1, b=2, c=3

    // var : Mutable type
    var x = 5
    x += 1
    println("x=$x")                 // x=6


    /*
      String type
     */
    var d = 1
    val s1 = "d is $d"

    d = 2
    val s2 = "${s1.replace("is", "was")}, but now is $d"
    println(s2)


    /*
      Defining functions
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // Return type can be inferred
    fun sum2(a: Int, b: Int) = a + b

    println("sum of 3 and 5 is ${sum(3, 5)}")
    println("sum2 of 3 and 5 is ${sum2(3, 5)}")

    // Unit type is void return type in Java
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }
    // Unit type can be skipped
    fun printSum2(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }
    printSum(2 ,3)
    printSum2(2,3)
}