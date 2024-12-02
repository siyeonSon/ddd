package com.siyeonson.ddd.domain.order;

public class Money {
    private int value;

    public Money(int value) {
        this.value = value;
    }

    // value 를 변경할 수 있는 메서드 없음
    public Money add(Money money) {
        return new Money(this.value + money.value);
    }

    public Money multiply(int multiplier) {
        return new Money(this.value * multiplier);
    }

    public int getValue() {
        return value;
    }
}
