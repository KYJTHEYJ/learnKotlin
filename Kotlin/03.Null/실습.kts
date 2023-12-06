var number : Int? = null // nullable
println(number)

//var number2 : Int = null // non-nullable

var number3 : Int? = 3 + 5
var number4 : Int = 10

var number5 : Int? = number3 + number4
// error -> nullable한 변수를 더하는 것이기 때문에 코드 흐름에 따른 null의 가능성 때문에 애초에 컴파일러가 막아준다.
// nullable 한 변수 뒤에 !!를 입력하면 컴파일러에게 정상으로 보장한다고 약속하는 것 (하지만 에러시 NullPointerException)
//var number5 : Int? = number3!! + number4

println(number5)

/*
var number6 : Int = 3 + 5
var number7 : Int = 10

var number8 : Int? = number6 + number7
println(number8)
*/
