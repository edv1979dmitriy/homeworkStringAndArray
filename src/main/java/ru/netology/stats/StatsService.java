package ru.netology.stats;

public class StatsService {

    public long sumAllSale(long[] sales) {

        long summa = 0;
        for (long sumSaleMonths : sales) {
//            summa = summa + sumSaleMonths;
            summa += sumSaleMonths;
        }
        return summa;
    }

    public double averageSumSalesMonths(long[] sales) {

//        return sumAllSale(sales) / 12;
        // Чтобы получить среднее значение с двумя знаками после запятой сначала умножим общую сумму
        // продаж на 100 и разделим на количество месяцев (длину массива). Потом значение округлим до
        // целой части и разделим на 100 (чтобы вернуть запятую на место).
        return Math.round(sumAllSale(sales) * 100.0 / sales.length) / 100.0;
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
        for (long sumOfMonths : sales) {
            if (sumOfMonths < averageSumSalesMonths(sales)) {
//                sumOfMonthsBelow = sumOfMonthsBelow + 1;
                sumOfMonthsBelow++;
            }
        }
        return sumOfMonthsBelow;
    }

    public int sumOfMonthsSalesAboveAverage(long[] sales) {

        int sumOfMonthsAbove = 0;
        for (long sumOfMonths : sales) {
            if (sumOfMonths > averageSumSalesMonths(sales)) {
//                sumOfMonthsAbove = sumOfMonthsAbove + 1;
                sumOfMonthsAbove++;
            }
        }
        return sumOfMonthsAbove;
    }
}