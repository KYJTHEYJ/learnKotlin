// if
var num1: Int = 10;

if(num1 == 10) {
    println("if문")
} else if(num1 == 20) {
    println("if문2")
} else {
    println("if문3")
}

// 변수에 값을 부여할 때도 사용가능, 하지만 else 필수
var num2: Int = if(num1 == 10) 100 else 200
println(num2)

//when
var num3: Int = 100
when(num3) {
    10 -> {
        println("when문1")
    }

    //바로바로 Java의 break가 적용되는 것처럼 해당하는 첫번째 결과만 도출되고 끝이 남
    //100 -> {
    //    println("when문2")
    //}

    999 -> println("when문 괄호생략")

    //아예 다른 타입을 검사할 수는 없다 조건은 Int인데 갑자기 is String 같이 다른 타입을 비교하여 검사할 수는 없으니 유의
    is Int ->  println("when문 타입검사")

    in 10..999 -> println("when문 식 대입")

    else -> {
        println("when문3")
    }
}