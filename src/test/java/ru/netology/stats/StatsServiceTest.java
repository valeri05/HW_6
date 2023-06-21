package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findSumSales() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumSales(months);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findmiddleSales() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.midSumSales(months);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMinBetweenEnds() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.getMonthMinSales(months);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxBetweenEnds() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.getMonthMaxSales(months);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findBelowAverageSales() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getBelowAverageSales(months);

        Assertions.assertEquals(expected, actual);
    }
}
