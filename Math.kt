class Math

fun calc1(a: Int, b: Int): Int {
    return if (a % 2 == 0) a * b else a + b
}


fun calc2(a: Int, b: Int, c: Int): Int {
    val x = a * b * c
    val y = a + b + c
    return if (x >= y) x else y
}


fun rating(rating: Int) {
    when (rating) {
        in 3..19 -> println("F")
        in 20..39 -> println("E")
        in 40..59 -> println("D")
        in 60..74 -> println("C")
        in 75..89 -> println("B")
        in 90..100 -> println("A")

        else -> println("Mark is out of range")
    }
}


fun envelope(a: Int, b: Int, v: Int, g: Int): Boolean {
    return (a < v && b < v) && (a < g && b < g)
}


fun even() {
    var resultEven = 0
    var resultOfEvenSum = 0
    for (i in 1..99) {
        if (i % 2 == 0) {
            resultEven++
            resultOfEvenSum += i
        }
    }
    println("Amount of even numbers - $resultEven, sum of even numbers - $resultOfEvenSum")
}

fun factorial(x: Int): Int {
    return if (x == 0) {
        1
    } else {

        var result = 1
        for (i in 1..x) {
            result *= i
        }
        return result
    }

}

fun toBinary(n: Int) = with(StringBuilder()) {
    var i = n
    while (i > 0) {
        if (i % 2 == 0) {
            append("0")
        } else {
            append("1")
        }
        i /= 2

    }
    toString()
}



