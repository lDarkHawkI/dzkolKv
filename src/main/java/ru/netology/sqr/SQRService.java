package ru.netology.sqr;

public class SQRService {
    public int countSquare(int num, int num1) {
        int iterationCount = 0;

        for (int i = 10; i <= 99; i++)
            if (i * i >= num) {
                if (i * i <= num1) {
                    iterationCount++;
                }
            }

        return iterationCount;
    }

}








