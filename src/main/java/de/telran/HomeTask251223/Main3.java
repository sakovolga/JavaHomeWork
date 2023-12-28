package de.telran.HomeTask251223;

import java.util.Optional;

public class Main3 {
    public static void main(String[] args) {
//        3. функциональный интерфейс SafeDivision с методом divide, который безопасно
//        делит два числа и возвращает Optional<Double>.
//        Реализуйте метод, который делит два числа с использованием SafeDivision,
//        обрабатывая случай деления на ноль.
    division(Main3::divideTwoNumbers, 78, 98);
    }
    public static Optional<Double> divideTwoNumbers(double num1, double num2){
        Optional<Double> optionalNum1 = Optional.ofNullable(num1);
        Optional<Double> optionalNum2 = Optional.ofNullable(num2);
        if (optionalNum1.isPresent() && optionalNum2.isPresent() && optionalNum2.get() != 0){
            double result = optionalNum1.get() / optionalNum2.get();
            return Optional.of(result);
        } else return Optional.empty();

    }
    public static void division(SafeDivision safeDivision, double num1, double num2){
        System.out.println(safeDivision.divide(num1, num2));
    }
}
@FunctionalInterface
interface SafeDivision{
    Optional<Double> divide(double num1, double num2);
}