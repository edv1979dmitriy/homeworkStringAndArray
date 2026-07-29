package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumAllSaleTest() {
        StatsService service = new StatsService();
        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        long expected = 4250;
        long actual = service.sumAllSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumAllSaleTestZero() {
        StatsService service = new StatsService();
        long[] sales = {0,0,0,0,0,0,0,0,0,0,0,0};
        long expected = 0;
        long actual = service.sumAllSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumSalesMonthsTest() {
        StatsService service = new StatsService();
        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        long expected = 354;
        long actual = service.averageSumSalesMonths(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsMaxSumSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        long expected = 8;
        long actual = service.numberMonthsMaxSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsMaxSumSalesTestZero() {
        StatsService service = new StatsService();
        long[] sales = {0,0,0,0,0,0,0,0,0,0,0,0};
        long expected = 0;
        long actual = service.numberMonthsMaxSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsMinSumSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        long expected = 7;
        long actual = service.numberMonthsMinSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumOfMonthsSalesBelowAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        long expected = 7;
        long actual = service.sumOfMonthsSalesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumOfMonthsSalesAboveAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        long expected = 5;
        long actual = service.sumOfMonthsSalesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
