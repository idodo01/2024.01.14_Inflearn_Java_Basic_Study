package extends1.super3;

public class Class2 extends Class1 {

    public Class2() {
        // super() 를 사용할 수 없음 (Class1에 기본 생성자가 없기에)

        super(10); // 매개변수 있는 생성자 호출, 생략 못 함
        System.out.println("Class2 생성자");
    }
}

