package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        // bigData.data의 값이 null 이기에 NullPointerException 발생
        // 이를 해결하기 위하여 Data 인스턴스 생성해주면 됨
        bigData.data = new Data(); 
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        //NullPointerException 해결됨
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
