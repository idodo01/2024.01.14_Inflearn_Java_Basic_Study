package oop1;

public class ValueDataMain1 { // 1. 절차지향 프로그래밍

    public static void main(String[] args) {
        ValueData1 valueData = new ValueData1();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자=" + valueData.value);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value=" + valueData.value);
    }
}
