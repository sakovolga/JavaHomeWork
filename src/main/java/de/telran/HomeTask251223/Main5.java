package de.telran.HomeTask251223;

public class Main5 {
    public static void main(String[] args) {
//   5. Создайте функциональный интерфейс Logger с методом log, который принимает строку и выводит её в консоль.
//      Напишите метод, который использует Logger для логирования различных сообщений.

        logMessage((message) -> System.out.println(message), "I use functional interface");
    }
    public static void logMessage(Logger logger, String message){
        logger.log(message);
    }
}
@FunctionalInterface
interface Logger{
    void log(String str);
}