package org.example;

public class SQRService {
    public int calcSQR(int x, int y) {
        int quantity = 0;
        for (int i = 10; i <= 100; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                quantity = quantity + 1;
            }
        }
        return quantity;
    }
}