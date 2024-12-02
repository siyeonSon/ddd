package com.siyeonson.ddd.domain.order;

public class Receiver {
    private String receiverName;
    private String receiverPhoneNumber;

    public Receiver(String receiverName, String receiverPhoneNumber) {
        this.receiverName = receiverName;
        this.receiverPhoneNumber = receiverPhoneNumber;
    }
}
