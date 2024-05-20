package static2;

public class DecoMain2 {

    public static void main(String[] args)  {

        // 인스턴스를 생성하는 이유는
        // 인스턴스 변수를 사용하기 위함인데,

        // DecoUtil2 같은 경우는 메소드만으로만 구성된 클래스이다
        // 따라서, static을 통해서 클래스로 호출하여
        // 불필요한 코드(인스턴스 생성, 인스턴스 호출)를 줄인다

        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before: "+s);
        System.out.println("after: "+deco);

    }

}