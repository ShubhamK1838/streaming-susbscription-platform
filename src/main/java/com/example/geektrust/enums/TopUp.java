package com.example.geektrust.enums;

public enum TopUp {
    FOUR_DEVICE(4, 50), TEN_DEVICE(10, 100);


    private final int deviceLimit;
    private final int price;

    TopUp(int limit, int price) {
        this.deviceLimit = limit;
        this.price = price;
    }

    public int getDeviceLimit() {
        return deviceLimit;
    }

    public int getPrice() {
        return price;
    }
}
