package de.telran.HomeTask051223;

public class SecondMinElement {
    public static void main(String[] args) {
        int[] arr = {54, 5, 8, 7, -3, -3, -10, 5, 13, 9};
        System.out.println(getSecondMin(arr));
        System.out.println(getThirdMin(arr));
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static int getSecondMin(int[] arr){
        int secondMin = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < secondMin && j > getMin(arr)) secondMin = j;
        }
        return secondMin;
    }
    public static int getThirdMin(int[] arr){
        int thirdMin = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < thirdMin && j > getMin(arr) && j > getSecondMin(arr))
                thirdMin = j;
        }
        return thirdMin;
    }
}
