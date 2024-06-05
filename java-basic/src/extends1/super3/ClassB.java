package extends1.super3;

public class ClassB extends ClassA {

    public ClassB(int a) {
        // super(); 기본 생성자 호출, 생략 가능
                   // 생략해도 있을 때와 동일하게 호출됨
        System.out.println("ClassB 생성자 a=" + a);
    }
}
