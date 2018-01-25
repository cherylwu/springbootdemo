package kotlindemo


import com.example.springbootdemo.ForKotlinCall
import java.lang.Integer.parseInt

fun printhello() {
    val x: IntArray = intArrayOf(1, 3, 5)
    x[0] = x[1] + x[2]

    //println("*****THIS IS IntArray: " + x[0] + x[1] + x[2])
    println("hello, world!" + x[0])

    for (m in x.indices) {
        println("x [${m}] : " + x[m])
    }
}

val PI = 3.1415
var m = 5
fun plus(n: Int): Int {
    m += n
    return m
}

fun main(args: Array<String>) {
    /* printhello()
     val asc = Array(6, { i -> ((i * i).toString()) })
     for (name in asc) {
         println("hello, ${name}")
     }
    println(plus(m));
    println(plus(m));
    println("m to ${m + 1}")
    print("sum of a+b is -->")
    println(sum(2, 3))
    println("${sumTwo(2, 3)}")
    sumThree(2, 3)
    sumFour(5, 9)
    println("${sumFour(5, 9)}")
    println(maxOf(15, 16))
    printProduct("16","19")
    println(getStringLength("objects"))
*/

    var items = listOf(111, "bbb", true, "bike", "mobile", "base")

    var result = ForKotlinCall.kotLinCallFun(items.toString())
    println(result)

    items.filter { it is String && it.startsWith("b") }
            .map { it.toString().toUpperCase() }
            .sortedBy { it }
            .forEach { println(it) }
    println("****************************************")
    printArray(items);

    listIterate()

    println(describe(1))

    checkRange(9, 9)

    for (x in 1..5 step 2) {
        println(x)
    }
    for (x in 9 downTo 1 step 3) {
        println(x)
    }
}

fun maxOf(x: Int, y: Int) = if (x > y) x else y

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumTwo(a: Int, b: Int) = a + b

fun sumThree(a: Int, b: Int): Unit {
    println("sumThree(a,b) with ${a} and ${b} is ${a + b}")
}

fun sumFour(a: Int, b: Int) {
    //final defining : val
    val x: Int = 3
    //resignable defining: var
    var y = 6
    val z: Int
    y += 1
    z = 15

    println("sumFour $a and $b is ${a + b}")
}

fun printProduct(args1: String, args2: String) {
    var x = parseInt(args1)
    var y = parseInt(args2)
    if (x != null && y != null) {
        println(sum(x, y))
    } else {
        println("ERROR")
    }
}

fun getStringLength(arg: Any): Int? {
    if (arg is String) {
        return arg.length
    } else {
        return null
    }
}

fun printArray(array: List<Any>): Unit {
    for (item in array) {
        println(item);
    }
}

fun listIterate() {
    var items = listOf("abc", "shui", "water")
    for (index in items.indices) {
        println("items.$index is ${items[index]}")
    }
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "one"
            is String -> "string"
            !is String -> "not String"
            is Long -> "long"
            else -> "unknown"
        }

fun checkRange(x: Int, y: Int) {
    if (x in 1..y) {
        println("$x is between 1 and $y")
    } else
        println("$x isn't between 1 and $y")
}