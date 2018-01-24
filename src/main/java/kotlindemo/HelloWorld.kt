package kotlindemo

fun printhello() {
    val x: IntArray = intArrayOf(1, 3, 5)
    x[0] = x[1] + x[2]

    //println("*****THIS IS IntArray: " + x[0] + x[1] + x[2])
    println("hello, world!" + x[0])

    for (m in x.indices) {
        println("x [${m}] : " + x[m])
    }
}

fun main(args: Array<String>) {
    printhello()
    val asc = Array(6, { i -> ((i * i).toString()) })
    for (name in asc) {
        println("hello, ${name}")
    }


}