package ru.netology.stats;

public class StatsService {

    public long sumSales(int[] months) {
        int sum = 0;
        for (int num : months) {
            sum = sum + num;
        }
        return sum;
    }

    public int midSumSales(int[] months) {
        int midSum = (int) sumSales(months) / months.length;
        return midSum;
    }

    public int getMonthMaxSales(int[] months) {
        int max = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] >= months[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int getMonthMinSales(int[] months) {
        int min = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] <= months[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int getBelowAverageSales(int[] months) {
        int mid = midSumSales(months);
        int counter = 0;
        for (int month : months) {
            if (month < mid) {
                counter++;
            }
        }
        return counter;
    }
}
