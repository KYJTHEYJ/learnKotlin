// 클래스를 선언하는 방법
class Person {

}

// 생성자
// 주 생성자
class User1 constructor(name: String) {
    val userName: String // 클래스 변수 (Property) -> 초기화 필요

    init { // 클래스가 생성될 때 (클래스를 통해 객체를 만들 때 호출) 호출
        println(name)
        userName = name
    }
}
// User1 이라는 클래스는 name이라는 String이 객체를 만들려면 필요하다
// userName은 init block 안에서 초기화

// Class를 호출 -> 인스턴스화
val user = User1("김")

// 주 생성자 -> init Block을 생략
class User2 constructor(name: String) {
    val userName: String = name // 클래스 변수 (Property) -> 초기화 필요
}

// 주 생성자 -> constructor를 생략
class User3(name: String) {
    val userName: String = name // 클래스 변수 (Property) -> 초기화 필요
}

// 주 생성자 -> 기본값
class User4(name: String = "김3") {
    val userName: String = name // 클래스 변수 (Property) -> 초기화 필요
}

class User5 constructor(age: Int, name: String) {
    val age: Int
    val name: String

    init {
        this.age = age
        this.name = name
    }
}

// .의 의미 .은 객체의 속성이나 기능을 사용할 때 사용한다
val user5 = User5(20, "김김김")
println(user5.age)

// 부 생성자 (Secondary Constructor)
// constructor 키워드 생략 불가
// 주 생성자에는 객체를 만들기 위한 필수 조건을, 부 생성자에는 객체를 만들기 위한 부가적 요건들을 기입한다
// 부 생성자에는 주 생성자에서 필요한 조건을 포함하고 있어야 한다 (파라미터를 포함하고 있어야함)
// 부 생성자는 주 생성자에게 생성을 위임해야한다
class User6 constructor(name: String) {
    var age: Int
    val name: String

    init {
        println("init")
        this.name = name
        this.age = 50
    }

    //부 생성자 (클래스 내부에 위치)
    constructor(name: String, age: Int) : this(name) {
        println("init2")
        this.age = age
    }
}

val user6 = User6(name = "김김김2")
println(user6.name)

val user6_2 = User6(name = "김김김3", 25)
println(user6_2.name)
println(user6_2.age)

// 실행순서 : 부생성자 호출 -> 부생성자 안 주생성자 호출 -> init 블록 호출 -> 부생성자 본문 실행
// 클래스 프로퍼티를 초기화 하지 않아도 되는 이유 : 초기화 블록에서 초기화를 보장함 -> 클래스가 생성될 때 초기화 블록은 무조건 실행

// 주 생성자가 없는 것 처럼 보이고, 부 생성자만 있을 때, 부 생성자가 주 생성자 처럼 보임 -> 부 생성자가 맞음 (constructor 생략시 에러남)
// 주 생성자는 코틀린 컴파일러가 자동으로 만들어 줌
class User7 {
    val age: Int
    val name: String

    constructor(age: Int, name: String) {
        this.age = age
        this.name = name
    }
}

val user7 = User7(10, "???")
println(user7.name)