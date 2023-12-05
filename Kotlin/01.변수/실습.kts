//1. var 변수 선언 -> 꼭 선언과 동시에 초기화 되어야 함을 잊지말 것
var changeYes = 100
println(changeYes)

/*
// 선언과 동시에 초기화 안되면 에러!
var changeYesButNoInitialize
changeYesButNoInitialize = 100
*/

changeYes = 200
println(changeYes)

//2.val 변수 선언 -> 할당 후엔 재할당이 불가하다
val CHANGE_NO = 100

/*
// 재할당 불가!
CHANGE_NO = 200
*/
