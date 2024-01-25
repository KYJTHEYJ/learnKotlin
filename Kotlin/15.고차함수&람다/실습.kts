fun addTwoNum(num1: Int, num2: Int): Int {
    return num1 + num2
}

//고차함수
fun addTenNine(function: (Int, Int) -> Int) {
    val result: Int = function(10, 9)
    println("결과는 $result")
}

addTenNine(::addTwoNum)

//람다
//1. 풀버전
val addTenNine2: (Int, Int) -> Int = { num1: Int, num2: Int ->
    num1 + num2
}

addTenNine(addTenNine2) // -> 람다는 호출시 :: 사용 안해도됨

//2. 생략 (파라미터 타입을 알고 있으므로 지정 안해줘도 됨)
val addTenNine3: (Int, Int) -> Int = { num1, num2 ->
    num1 + num2
}

addTenNine(addTenNine3)

//3. 생략 2
val addTenNine4 = { num1: Int, num2: Int ->
    num1 + num2
}

addTenNine(addTenNine4)

//4. 너무 간단할 경우
addTenNine { number1, number2 -> number1 + number2 }

//5. 파라미터가 없는 경우
val addTenNine5: () -> Int = {
    10 + 9
}

//6. 파라미터가 하나인 경우
val addTenNine6: (Int) -> Int = {
    10 + 9
}