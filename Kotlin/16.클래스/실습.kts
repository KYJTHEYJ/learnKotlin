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
//User1 이라는 클래스는 name이라는 String이 객체를 만들려면 필요하다
//userName은 init block 안에서 초기화

//Class를 호출 -> 인스턴스화
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

//부 생성자 (Secondary Constructor)
//constructor 키워드 생략 불가
class User6 constructor(age: Int, name: String) {
    val age: Int
    val name: String

    init {
        this.age = age
        this.name = name
    }

    //부 생성자 (클래스 내부에 위치)
    constructor(name: String, age: Int)
}
