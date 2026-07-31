package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        long[] sales = { 250,250,300,400,500,90,0,1000,400,900,90,70 };
        StatsService service = new StatsService();
        long summa = service.sumAllSale(sales);
        System.out.println(" Итоговый отчёт за год: ");
        System.out.println(" Сумма всех продаж: " + summa);

        double averageSum = service.averageSumSalesMonths(sales);
        System.out.println(" Средняя сумма продаж в месяц: " + averageSum);

        int numberMonthsMax = service.numberMonthsMaxSumSales(sales);
        System.out.println(" Пик продаж пришёлся на " + numberMonthsMax + "-й месяц.");

        int numberMonthsMin = service.numberMonthsMinSumSales(sales);
        System.out.println(" Минимум продаж пришёлся на " + numberMonthsMin + "-й месяц.");

        int sumOfMonthsBelow = service.sumOfMonthsSalesBelowAverage(sales);
        System.out.println(" " + sumOfMonthsBelow + " месяцев продажи были ниже среднего.");

        int sumOfMonthsAbove = service.sumOfMonthsSalesAboveAverage(sales);
        System.out.println(" " + sumOfMonthsAbove + " месяцев продажи были выше среднего.");
    }
}