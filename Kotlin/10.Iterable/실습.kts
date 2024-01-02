// Range
val RANGE1 = 1..10
println(RANGE1)

val RANGE2 = 1 until 10 // -> 1~9
println(RANGE2)

val RANGE3 = 'A'..'Z' // -> 알파벳의 순서도 알고 있음
println(RANGE3)

// Progression
val RANGE4 = 1..10 step 2 // 1, 3, 5, 7, 9
println(RANGE4)

val RANGE5 = 10 downTo 1 step 2
println(RANGE5)

//step
// - 특징 : 값에 상관없이 첫번째는 무조건 index 0 부터 시작

// 1부터 5까지 (Iterable)
var collection1 = listOf<Int>(1,2,3,4,5)