package ru.netology.stats;

public class StatsService {

    public long sumAllSale(long[] sales) {

        long summa = 0;
        for (long s : sales) {
            summa = summa + s;
        }
        return summa;
    }

    public long averageSumSalesMonths(long[] sales) {

        return sumAllSale(sales) / 12;
    }

    public int numberMonthsMaxSumSales(long[] sales) {

        int zeroSales = 0;
        int numberMonthsMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[numberMonthsMax] <= sales[i]) {
                numberMonthsMax = i;
            }
        }
        if (sales[numberMonthsMax] == 0) {
            return zeroSales;
        } else {
            return numberMonthsMax + 1;
        }
    }

    public int numberMonthsMinSumSales(long[] sales) {

        int numberMonthsMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[numberMonthsMin] >= sales[i]) {
                numberMonthsMin = i;
            }
        }
        return numberMonthsMin + 1;
    }

    public int sumOfMonthsSalesBelowAverage(long[] sales) {

        int sumOfMonthsBelow = 0;
        for (long s : sales) {
            if (s < averageSumSalesMonths(sales)) {
                sumOfMonthsBelow = sumOfMonthsBelow + 1;
            }
        }
        return sumOfMonthsBelow;
    }

    public int sumOfMonthsSalesAboveAverage(long[] sales) {

        int sumOfMonthsAbove = 0;
        for (long s : sales) {
            if (s > averageSumSalesMonths(sales)) {
                sumOfMonthsAbove = sumOfMonthsAbove + 1;
            }
        }
        return sumOfMonthsAbove;
    }
}