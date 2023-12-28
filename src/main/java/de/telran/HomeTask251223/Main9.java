package de.telran.HomeTask251223;

import java.sql.Array;
import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
//        Создайте функциональный интерфейс NumberProcessor с методом process,
//        который выполняет операцию над массивом чисел.
//        Напишите метод, который принимает массив чисел и NumberProcessor,
//        и возвращает массив после умножения каждого элемента на -1
        int[] numbers = {56, -9, 5, 100};
        System.out.println(Arrays.toString(getNewArray(Main9::multipleArray, numbers)));
    }
    public static int[] getNewArray(NumberProcessor numberProcessor, int[] arr){
        numberProcessor.process(arr);
        return arr;
    }
    public static void multipleArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * (-1);
        }
    }
}
@FunctionalInterface
interface NumberProcessor{
    void process(int[] arr);
}