var numbers = arrayOf(1,2,3)

for(number in numbers){
    println(number)
}

println("-----")

for((index, value) in numbers.withIndex()) {
    println("index: " + index)
    println("value: " + value)
}

println("-----")

//인덱스만 필요시
for(index in numbers.indices) {
    println(index)
}

println("-----")

numbers.forEach {
    println("value : " + it)
}

//index, value 형태
numbers.forEachIndexed { index, i ->
    println(index)
    println(i)
}