package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void testSum() {
        StatsService service = new StatsService();
        int[] purchases = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int expected = 78;
        int actual = service.calculateSum(purchases);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testAverageSum() {
        StatsService service = new StatsService();
        int[] purchases = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        double expected = 1.5;
        double actual = service.calculateAverageSum(purchases);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testMaxMonth() {
        StatsService service = new StatsService();
        int[] purchases = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 9};
        int expected = 11;
        int actual = service.calculateMaxMonth(purchases);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testMinMonth() {
        StatsService service = new StatsService();
        int[] purchases = {9, 10, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int expected = 3;
        int actual = service.calculateMinMonth(purchases);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCounterUnderAverage() {
        StatsService service = new StatsService();
        int[] purchases = {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3};
        int expected = 5;
        int actual = service.calculateCounterUnderAverage(purchases);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCounterUpperAverage() {
        StatsService service = new StatsService();
        int[] purchases = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100};
        int expected = 1;
        int actual = service.calculateCounterUpperAverage(purchases);
        Assertions.assertEquals(actual, expected);
    }

}
