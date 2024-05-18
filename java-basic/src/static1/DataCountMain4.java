package static1;

public class DataCountMain4 {
    public static void main(String[] args) {

       Data4 data1 = new Data4("A");

       // static 함수 
       // 1. 클래스를 통한 접근
       System.out.println("A count="+Data4.count); 

       // 2. 인스턴스를 통한 접근
       System.out.println("B count="+data1.count);

       // 인스턴스(힙 영역)로 접근해도
       // static 변수(메서드-static 영역)임을 인지할 수 있다

       // 그러나 data1.count로 접근하면 인스턴스 변수이라고 
       // 이해할 수 있기 때문에 권장되는 방법이 아니다


    }

}