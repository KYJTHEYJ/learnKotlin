//배열 선언법 (1)
var array1 = arrayOf(true, 1)
println(array1.get(0))

var array2 = arrayOf<Int>(1, 2, 3)
println(array2.get(2))

var array3 = intArrayOf(1, 2, 3, 4, 5)
println(array3.get(4))

//배열 선언법 (2)
var array4 = Array(10, {1})

//var array5 = IntArray(10, {2.2})

//배열 선언법 (3)
var array6 = Array<Int>(10, {8})

var array7 = Array<String>(5, {""})

//var array8 = Array(10, {null})

val SCORE: Array<Int> = Array<Int>(1, {100})
println(SCORE[0])

val SCORE2 : Int = SCORE[0]
println(SCORE2)