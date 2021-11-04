package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldCountSquare1() {
        SQRService sqrService2 = new SQRService();
        int expected = 5;
        int actual = sqrService2.countSquare(100, 200);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSquare2() {
        SQRService sqrService2 = new SQRService();
        int expected = 8;
        int actual = sqrService2.countSquare(100, 300);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSquare3() {
        SQRService sqrService2 = new SQRService();
        int expected = 22;
        int actual = sqrService2.countSquare(100, 1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSquare4() {
        SQRService sqrService2 = new SQRService();
        int expected = 61;
        int actual = sqrService2.countSquare(100, 5000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSquare5() {
        SQRService sqrService2 = new SQRService();
        int expected = 1;
        int actual = sqrService2.countSquare(0, 100);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSquare6() {
        SQRService sqrService2 = new SQRService();
        int expected = 90;
        int actual = sqrService2.countSquare(0, 12000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSquare7() {
        SQRService sqrService2 = new SQRService();
        int expected = 0;
        int actual = sqrService2.countSquare(0, 0);
        assertEquals(expected, actual);
    }
}
