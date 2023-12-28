package de.telran.HomeTask251223;

public class Main7 {
    public static void main(String[] args) {
//        7. Создайте функциональный интерфейс TextAnalyzer с методом analyze,
//        который принимает текст и анализирует его, возвращая результат анализа.
//        Напишите метод, который принимает строку и TextAnalyzer,
//        и подсчитывает количество уникальных слов в тексте.

        int x = getCountOfUniqueWords(Main7::getCount, "mama papa mama sister");
        System.out.println(x);

    }
    public static int getCount(String text){
        String[] arrString = text.split(" ");
        String[] unique = new String[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            if (!isExist(unique, arrString[i])){
                unique[i] = arrString[i];
            }
        }
        int count = 0;
        for (String s: unique){
            if (s != null){
                count++;
            }
        }
        return count;
    }
    public static boolean isExist(String[] str, String founded){
        for (String s: str){
            if (s != null && s.equals(founded)){
                return true;
            }
        }
        return false;
    }
    public static int getCountOfUniqueWords(TextAnalyzer textAnalyzer, String text){
        return textAnalyzer.analyze(text);
    }
}
@FunctionalInterface
interface TextAnalyzer{
    int analyze(String str);
}