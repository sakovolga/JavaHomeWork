package de.telran.HomeTask251223;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
//    Создайте функциональный интерфейс ArrayRotator с методом rotate, который выполняет циклический сдвиг элементов массива.
//    Напишите метод, который принимает массив и ArrayRotator и шаг сдвига, и выполняет сдвиг массива на заданную позицию влево.
       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int[] rotatedArr = rotateArray((array) -> {
           int first = array[0];
           for (int j = 0; j < array.length; j++) {
               if (j != array.length - 1){
                   array[j] = array[j + 1];
               }
           }
           array[array.length - 1] = first;
           return array;
       }, arr, 5);
        System.out.println(Arrays.toString(rotatedArr));
    }
    public static int[] rotateArray(ArrayRotator arrayRotator, int[] arr, int n){
        int i = 0;
        while(i++ < n){
            arrayRotator.rotate(arr);
        }
        return arr;
    }
}
@FunctionalInterface
interface ArrayRotator{
    int[]rotate(int[] arr);
}
