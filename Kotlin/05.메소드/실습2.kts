// 4.간단한 함수
fun shortFunction(param1: Int, param2: Double): Double = param1 + param2

var result = shortFunction(10, 90.0)
println(result) //자동 형변환 100.0

// 5.가변인자를 갖는 함수 **
fun varargFunctionAndPrintFirst(vararg numbers: Int): Int {
    for (number in numbers) {
        println(number)
    }

    return numbers.first()
}

varargFunctionAndPrintFirst(1,2,3,4,5,6,7,8,9)