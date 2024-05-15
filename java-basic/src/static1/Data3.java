package static1;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++;
        // 원래는 Data3.count++; 인데
        // 같은 클래스이기에 생략 가능
    }

}