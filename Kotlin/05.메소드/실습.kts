// 1.기본형
fun basicFuntion(param1: Int, param2: Int): Int {
    val RESULT: Int = param1 + param2
    return RESULT
}

var resultBasicFunction = basicFuntion(1, 2)

println(resultBasicFunction)
println("\n")

// 2.기본값이 있는 경우
fun basicFunctionWithDefaultValue(param1: Int = 10, param2: Int): Int {
    return param1 + param2
}

var resultbasicFunctionWithDefaultValue = basicFunctionWithDefaultValue(10, 20)
println(resultbasicFunctionWithDefaultValue)
var resultbasicFunctionWithDefaultValue2 = basicFunctionWithDefaultValue(param2 = 20)
println(resultbasicFunctionWithDefaultValue2)
var resultbasicFunctionWithDefaultValue3 = basicFunctionWithDefaultValue(80, 20)
println(resultbasicFunctionWithDefaultValue3)
println("\n")

// 3.반환값이 없는 경우
var forChk = 100

fun noReturnFunction(param1: Int): Unit {
    forChk = param1
}
println(forChk)

noReturnFunction(300)

println(forChk)

fun noReturnFunction2(param1: Int, param2: Int) {
    println(param1 + param2)
    //return -> 값을 안적은 return은 가능하다
}
noReturnFunction2(10, 10)
println("\n")