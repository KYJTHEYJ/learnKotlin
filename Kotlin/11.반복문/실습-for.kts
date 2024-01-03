/*
//Range
for(value in 0..10) {
    println("test")
}
*/

/*
//Progression + step
for(value in 0..10 step 2) {
    println("test")
}
*/

/*
//Progression + downTo
for(value in 10 downTo 2) {
    println("test")
}
*/

val NUMBERS = listOf<Int>(5, 6, 7, 8)

/*
for(number in NUMBERS) {
    println(number)
}
*/

for (number in 0..NUMBERS.size) {
    println("test")
}

for (number in 0 until NUMBERS.size) {
    println("test2")
}

for ((index, value) in NUMBERS.withIndex()) {
    println("index : " + index)
    println("value : " + value)
}

//for-each
var numbers2 = listOf<Int>(5, 6, 7, 8)
numbers2.forEach { number ->
    println(number)
}