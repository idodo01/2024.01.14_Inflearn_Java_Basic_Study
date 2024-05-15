package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
       Data3 data1 = new Data3("A");
       System.out.println("A count="+Data3.count); 

       Data3 data2 = new Data3("A");
       System.out.println("B count="+Data3.count);

       // data1.count로 인스턴스로 접근하는게 아니라,
       // Data3.count으로 클래스 자체로 접근한다.

       // 인스턴스(data1)은 힙 영역에 생성되고, 
       // static 변수는 메서드 영역 내부 static 영역에 따로 생성되기 때문이다
       // 즉 영역이 다르다
    }

}