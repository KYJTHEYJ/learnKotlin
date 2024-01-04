//break
for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) {
            break;
        } else {
            println("j : " + j)
        }
    }
}

println("-----")

//continue
for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) {
            continue;
        } else {
            println("j : " + j)
        }
    }
}

println("-----")

//return
fun test(): Unit {
    for (i in 1..3) {
        println("i : " + i)
        for (j in 1..3) {
            if (j == 2) {
                return Unit
            } else {
                println("j : " + j)
            }
        }
    }
}

test()

println("-----")

//label + break
loop@for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) {
            break@loop
        } else {
            println("j : " + j)
        }
    }
}
// @loop 를 타고 loop@ 로 나온 for문에 break 그래서 1번만 작동

println("-----")
//label + continue
loop@for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) {
            continue@loop
        } else {
            println("j : " + j)
        }
    }
}
// @loop 를 타고 loop@ 로 나온 for문에 continue 작동

println("-----")
//foreach + label
//foreach는 break, continue 가 not allowed 임, label, return 만 가능, (근데 label을 여기에 왜..)
listOf<Int>(1,2,3).forEach loop@{
    if(it == 2) return@loop
    else println(it)
}