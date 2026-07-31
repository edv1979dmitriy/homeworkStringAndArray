package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

//    Объявим массив. Он будет: только внутри класса; принадлежит всему классу;
//    переменной sales нельзя присвоить другой массив, хотя поменять значения можно
    private static final long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};

    @Test
     void sumAllSaleTest() {
        StatsService service = new StatsService();
//        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        long expected = 4250;
        long actual = service.sumAllSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sumAllSaleTestZero() {
        StatsService service = new StatsService();
        long[] sales = {0,0,0,0,0,0,0,0,0,0,0,0};
        long expected = 0;
        long actual = service.sumAllSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void averageSumSalesMonthsTest() {
        StatsService service = new StatsService();
//        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        double expected = 354.17;
        double actual = service.averageSumSalesMonths(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void numberMonthsMaxSumSalesTest() {
        StatsService service = new StatsService();
//        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        int expected = 8;
        int actual = service.numberMonthsMaxSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void numberMonthsMaxSumSalesTestZero() {
        StatsService service = new StatsService();
        long[] sales = {0,0,0,0,0,0,0,0,0,0,0,0};
        int expected = 0;
        int actual = service.numberMonthsMaxSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void numberMonthsMinSumSalesTest() {
        StatsService service = new StatsService();
//        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        int expected = 7;
        int actual = service.numberMonthsMinSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void sumOfMonthsSalesBelowAverageTest() {
        StatsService service = new StatsService();
//        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        int expected = 7;
        int actual = service.sumOfMonthsSalesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void sumOfMonthsSalesAboveAverageTest() {
        StatsService service = new StatsService();
//        long[] sales = {250,250,300,400,500,90,0,1000,400,900,90,70};
        int expected = 5;
        int actual = service.sumOfMonthsSalesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
