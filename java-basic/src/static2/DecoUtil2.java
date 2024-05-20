package static2;

public class DecoUtil2 {

    // static 메소드는 인스턴스가 아닌 
    // 클래스로의 호출이 가능해진다        

    public static DecoUtil2(String str) {

        return "*" + str + "*";

    }

}