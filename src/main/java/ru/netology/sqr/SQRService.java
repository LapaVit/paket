package ru.netology.sqr;


public class SQRService {
    public int colculate(int x, int y) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                if (i * i <= y) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
