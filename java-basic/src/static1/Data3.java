package static1;

public class Data3 {
    public String name; // 인스턴스 변수
    public static int count; // static 변수 (= 정적 변수, 클래스 변수)

    public Data3(String name) {
        this.name = name;
        count++;
        // 원래는 Data3.count++; 인데
        // 같은 클래스이기에 생략 가능
    }

}
