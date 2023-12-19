//List
val NUMBERS = listOf<Int>(1, 2, 3)
//println(NUMBERS)
println(NUMBERS.indexOf(1))
println(NUMBERS.last())

val NUMBERS2 = mutableListOf<Int>(1, 2, 3)
NUMBERS2.set(0, 4)
NUMBERS2.add(3, 20)
NUMBERS2.add(60)
NUMBERS2.addAll(2, listOf<Int>(100, 100))
println(NUMBERS2)

//Set
val NUMBERS3 = setOf<Int>(1, 2, 3, 1, 1, 1, 2, 3, 1, 2, 3)
//println(NUMBERS3)

val NUMBERS4 = mutableSetOf<Int>(1, 2, 3, 1, 1, 2, 3, 12, 1, 1, 1, 23)
//println(NUMBERS4)

//Map
val NUMBERS5 = mapOf<Int, Int>(1 to 1, 2 to 2, 3 to 3)
//println(NUMBERS5)
println(NUMBERS5.keys)
println(NUMBERS5.values)
println(NUMBERS5.size)
println(NUMBERS5.getOrDefault(4,10)) //Key가 없으면 기본값을 출력함

val NUMBERS6 = mapOf<Int, Int>(Pair(1, 2), Pair(2, 3), Pair(3, 4))
///println(NUMBERS6)

