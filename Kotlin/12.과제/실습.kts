//1. 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자
fun repeatPrintN(number: Int, printString: String?) {
    for (num in 1..number) {
        println(printString)
    }
}

repeatPrintN(10, "Vinnie Paz")

println("-----")

//2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자
fun sumFor(number: Int): Int {
    var sumValue: Int = 0
    for (num in 1.rangeTo(number)) {
        sumValue += num
    }

    return sumValue
}

println(sumFor(10))

println("-----")

//3. 1부터 100까지의 수중에서 7의 배수의 합을 구하는 함수를 만드시오
fun sumSevens(): Int {
    var sumValue: Int = 0
    for (num in 1..100) {
        if (num % 7 == 0) {
            sumValue += num
        }
    }

    return sumValue
}

println(sumSevens())

println("-----")

//4. 100 보다 작은 숫자를 넣어주면, 1씩 증가를 시키고 100 이 되면 종료되는 함수를 만드시오

fun limit100(under100: Int) {
    if (under100 >= 100) {
        println("100 미만의 수를 입력하세요")
        return
    }

    for (under100 in under100..100) {
        if (under100 == 100) {
            println(under100)
            return
        }
    }
}

limit100(190)

fun limit100_2(under100: Int) {
    var under100_2 = under100
    if (under100_2 >= 100) {
        println("100 미만의 수를 입력하세요")
        return
    }

    while (under100_2 <= 100) {
        if (under100_2 == 100) {
            println(under100_2)
            return
        }

        under100_2++
    }
}

limit100_2(90)

println("-----")

//5. 시험 성적 리스트 [70,71,72,77,78,79,80,82,90,99]
//   와 동일한 크기의 배열을 만들고, 합격이면 true, 불합격이면 false를 담는 함수를 만드시오
//   (80점 이상 부터 합격, 정답 예시 (False,False,...))
var scores = listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99)

fun getResultFromScoreList(scoreList: List<Int>): Array<String> {
    var resultList = Array<String>(scoreList.size, {""})

    for ((index, score) in scoreList.withIndex()) {
        if (score >= 80) {
            resultList.set(index, "true")
        } else {
            resultList.set(index, "false")
        }
    }

    return resultList
}

var result: Array<String> = getResultFromScoreList(scores);

/*
for(index in 0 until result.size) {
    println(result.get(index))
}`
*/

result.forEach {
    println(it)
}


