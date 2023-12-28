package de.telran.HomeTask251223;

import java.sql.Array;
import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
//        Создайте функциональный интерфейс MatrixProcessor с методом process, который принимает
//        двумерный массив (матрицу) целых чисел и выполняет над ним операцию.
//        Напишите метод, который принимает матрицу и MatrixProcessor,
//        и выполняет операцию нахождения транспонированной матрицы.

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixProcessor matrixProcessor = ((array) -> {
            int[][] trMatrix = new int[array.length][array.length];
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length; j++) {
                    trMatrix[i][j] = array[j][i];
                }
            }
            return trMatrix;
        });
        print(arr);
        System.out.println("-----");
        print(findTransponMatrix(matrixProcessor, arr));
    }
    static public int[][] findTransponMatrix(MatrixProcessor matrixProcessor, int[][] arr){
        return matrixProcessor.process(arr);
    }
    static public void print(int[][] arr){
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
   }
@FunctionalInterface
interface MatrixProcessor{
    int[][] process(int[][] arr);
}
