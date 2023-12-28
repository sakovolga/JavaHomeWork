package de.telran.HomeTask251223;

public class Main1 {
    public static void main(String[] args) {
//        1. Создайте функциональный интерфейс StringLength с методом getLength, который принимает строку и возвращает её длину.
//        Напишите метод, который принимает строку и StringLength интерфейс и выводит длину строки.
        getLength(str -> str.length(), "uuuu");
    }
    public static void getLength(StringLength stringLength, String str){
        System.out.println(stringLength.getLength(str));
    }
}
@FunctionalInterface
interface StringLength{
    int getLength(String str);
}