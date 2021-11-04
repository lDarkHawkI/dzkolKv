package ru.netology.sqr;

public class SQRService {
    public int countSquare(int num, int num1) {
        int iterationcount = 0;

        for (int i = 10; i <= 99; i++)
            if (i * i >= num) {
                if (i * i <= num1) {
                    iterationcount++;
                }
            }

        return iterationcount;
    }

}








