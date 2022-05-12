package ru.netology.sqr;

public class SQRService {
    public int SQRArea(int bottom, int top) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int number = i * i;
            if ((top > number) && (number > bottom)) {
                count++;
            }
        }
        return count;
    }
}
