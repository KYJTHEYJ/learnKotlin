val numbers = listOf<Int>(1,2,3)

try {
    numbers.get(4)
} catch(exception: Exception) {
    println(exception)
}

try {
    numbers.get(4)
} catch(exception: IllegalArgumentException) {
    println("예외1")
} catch(exception: ArrayIndexOutOfBoundsException) {
    println("예외2")
} finally {
    println("끝")
}