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
    var resultList = Array<String>(scoreList.size, { "" })

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

println("-----")

//6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
//   -> [[3,3],[1,5],...]
fun getAllDice(): Map<Int, Int> {
    var diceRange = 1..6
    var dice6Map = mutableMapOf<Int, Int>()

    for (diceRoll in diceRange) {
        for (diceRoll2 in diceRange) {
            if ((diceRoll + diceRoll2) == 6) {
                dice6Map.put(diceRoll, diceRoll2)
                break;
            }
        }
    }

    return dice6Map;
}

println(getAllDice())

fun getAllDice2(): MutableList<MutableList<Int>> {
    var diceRange = 1..6
    var resultList = mutableListOf<MutableList<Int>>()

    for (diceRoll in diceRange) {
        if (diceRoll == 6)
            break;

        var dice6List = mutableListOf<Int>()

        for (diceRoll2 in diceRange) {
            if ((diceRoll + diceRoll2) == 6) {
                dice6List.add(diceRoll)
                dice6List.add(diceRoll2)
                break;
            }
        }

        resultList.add(dice6List)
    }

    return resultList;
}

println(getAllDice2())

println("-----")

//7. 배부르기 위해서 먹어야하는 총 밥먹기 횟수, 현재 밥먹은 횟수, 두개를 받는 함수를 만드시오
//   함수는 "밥을 먹었다" 한번 출력을 할때 마다 밥을 1회 먹은 것으로 간주를 하고,
//   배가 부를 때까지 밥을 먹여야 한다
//   배가 부를 경우에는 "배가 부르다" 를 출력한다
//   배가 아무리 불러도 최소 한번은 무조건먹는다
//   fun eat(3,2):{}
//   ->"밥을 먹었다"
//   ->"배가 부르다"


fun eat(needTime: Int, eatTime: Int) {
    var time = eatTime

    do {
        println("밥을 먹었다")
        time++
    } while (time < needTime)

    println("배가 부르다")
}

eat(3, 2)

println("-----")

//8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사
//   그룹을 합쳐주는 함수를 만드시오
//   fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 2)
//   -> [["A", "B", "D", "E"], ["A", "B"]]
//
//   (합수 실행이 어려운 조건을 만나면 null을 리턴해야한다)
//   fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 100)
//   -> null

val soldierGroup1: List<String> = listOf<String>("A", "B", "C", "D", "E")
val soldierGroup2: List<String> = listOf<String>("A", "B", "C")

fun soldierGroups(
    soldierGroup1: List<String>,
    soldierGroup2: List<String>,
    deleteIndex: Int
): MutableList<MutableList<String>>? {
    if (soldierGroup1.size < deleteIndex - 1) {
        return null
    } else if (soldierGroup2.size < deleteIndex - 1) {
        return null
    } else {
        var group1: MutableList<String> = mutableListOf<String>()
        var group2: MutableList<String> = mutableListOf<String>()

        soldierGroup1.forEach { soldier ->
            group1.add(soldier)
        }

        soldierGroup2.forEach { soldier ->
            group2.add(soldier)
        }

        group1.removeAt(deleteIndex)
        group2.removeAt(deleteIndex)

        val finalSolderGroup: MutableList<MutableList<String>> =
            mutableListOf<MutableList<String>>()

        finalSolderGroup.add(group1)
        finalSolderGroup.add(group2)

        return finalSolderGroup
    }

}

println(soldierGroups(soldierGroup1, soldierGroup2, 2))

println("-----")

//9. 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오

fun gugudan(number: Int): MutableList<Int> {
    var resultList: MutableList<Int> = mutableListOf<Int>()

    for (index in 1..9) {
        resultList.add(number * index)
    }

    return resultList
}

println(gugudan(9))

println("-----")

//10. 숫자 리스트 두개를 넣어주면 짝수 홀수로 분리된 Map을 만드는 함수를 만드시오
//   (Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수" 한다)

fun oddEven(numberList1: List<Int>, numberList2: List<Int>): MutableMap<String, MutableList<Int>> {
    var oddList: MutableList<Int> = mutableListOf<Int>()
    var evenList: MutableList<Int> = mutableListOf<Int>()
    var resultMap: MutableMap<String, MutableList<Int>> = mutableMapOf<String, MutableList<Int>>()

    numberList1.forEach {
        if (it % 2 == 0) {
            evenList.add(it)
        } else {
            oddList.add(it)
        }
    }

    numberList2.forEach {
        if (it % 2 == 0) {
            evenList.add(it)
        } else {
            oddList.add(it)
        }
    }

    resultMap.put("짝수", evenList)
    resultMap.put("홀수", oddList)

    return resultMap
}

println(oddEven(listOf(1, 2, 3, 99, 100), listOf(9, 200, 8, 899, 1200)))