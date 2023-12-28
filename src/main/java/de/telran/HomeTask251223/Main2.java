package de.telran.HomeTask251223;

public class Main2 {
    public static void main(String[] args) {
//        2. функциональный интерфейс NumberOperation с методом operate, который принимает
//        два целых числа и возвращает целое число.
//        Напишите методы для выполнения базовых арифметических операций (сложение, вычитание, умножение, деление)
//        с использованием этого интерфейса.

//        I способ:
        NumberOperation sum = (a, b) -> a + b;
        NumberOperation difference = (a, b) -> a - b;
        NumberOperation multiplication = (a, b) -> a * b;
        NumberOperation division = (a, b) -> {
            if (b != 0) return a / b;
            else System.out.println("На ноль делить нельзя");
            return 0;
        };
        System.out.println(oper(sum, 65, 89));
        System.out.println(oper(difference, 65, 89));
        System.out.println(oper(multiplication, 65, 89));
        System.out.println(oper(division, 65, 5));

//            II способ
        int sum1 = oper((a, b) -> (a + b), 6, 8);
        int difference1 = oper((a, b) -> a - b, 19, 6);
        int multiplication1 = oper((a, b) -> a * b, 19, 6);
        int division1 = oper((a, b) -> {
            if (b != 0) return a / b;
            else System.out.println("На ноль делить нельзя");
            return 0;
        }, 7, 0);
        System.out.printf("sum = %d, difference = %d, multiplication = %d, division = %d",
                sum1, difference1, multiplication1, division1);
    }
    public static int oper(NumberOperation numberOperation, int num1, int num2){
        return numberOperation.operate(num1, num2);
    }
}
@FunctionalInterface
interface NumberOperation{
    int operate(int num1, int num2);
}