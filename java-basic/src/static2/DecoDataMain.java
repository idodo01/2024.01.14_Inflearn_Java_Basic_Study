package static2;

//import static static2.DecoData.staticCall;
//import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        // (추가) 정적메서드로 인스턴스 넘겨줬을 때
        // 인스턴스 변수& 메서드 사용가능해짐
        System.out.println("3. 정적 호출(인스턴스 넘겨줌)");
        DecoData.staticCall(data1);

    }
}
