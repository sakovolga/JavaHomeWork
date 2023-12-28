package de.telran.HomeTask251223;

import java.sql.Array;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
//  6. Создайте функциональный интерфейс ArrayTransformer с методом transform, который принимает массив
//  целых чисел и выполняет операцию возведения каждого элемента в квадрат.
//  Напишите метод, который принимает массив и ArrayTransformer, и изменяет массив, возведя каждый его элемент в квадрат.
        int[] arr1 = {87, 98, 345, 0, -2};

        int[] newArr = transformArray((arr) -> {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * arr[i];
            }
            return arr;
        }, arr1);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] transformArray(ArrayTransformer arrayTransformer, int[] arr){
        return arrayTransformer.transform(arr);
    }
}
@FunctionalInterface
interface ArrayTransformer{
    int[] transform(int[] arr);
}