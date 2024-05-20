package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 인스턴스 변수& 메서드는
        // 객체생성으로 인한 참조값을 통해서 호출할 수 있는데,

        // static 호출시에는 객체 생성은 안하고 바로 클래스로 접근하기에
        // 참조값이 없다 -> 인스턴스 변수& 메서드 호출 불가능

        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    
    // 정적 메서드로 참조값을 넘겨주게 되면
    // 인스턴스 변수& 메서드 접근이 가능해짐
    public static void staticCall(DecoData data) {
        data.instanceValue++; //인스턴스 변수 접근
        data.instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }


    // (추가) 인스턴스 메서드에서는 인스턴스, 정적 모두 접근 가능
    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }


    // 인스턴스 메서드
    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }
    // 정적 메서드
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
