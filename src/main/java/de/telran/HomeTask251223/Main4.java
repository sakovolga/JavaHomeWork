package de.telran.HomeTask251223;

public class Main4 {
    public static void main(String[] args) {
//        4. Создайте функциональный интерфейс UpperCaseConverter с методом convert,
//        который преобразует строку в верхний регистр.
//        Напишите метод, который принимает строку и UpperCaseConverter интерфейс,
//        и преобразует её в верхний регистр.
        convertToUpperCase(str -> {
            String str1 = str.toUpperCase();
            System.out.println(str1);
        }, "kjgkjk");
    }
    public static void convertToUpperCase(UpperCaseConverter upperCaseConverter, String str){
        upperCaseConverter.convert(str);
    }
}
@FunctionalInterface
interface UpperCaseConverter{
    void convert(String str);
}