package de.telran.HomeTask151223;

import java.util.ArrayList;
import java.util.List;

public class Handler {
//    1. Перебор List<String> и вывод каждого элемента.
    public static void getElement(List<String> list){
        for (String s : list) {
            System.out.println(s);
        }
    }

//    2. Перебор List<Integer> и вывод квадратов каждого числа.
    public static void getSquares(List<Integer> list){
        for (int s : list) {
            System.out.println(s * s);
        }
    }
//    3. Перебор List<Character> и вывод ASCII-кода каждого символа.
    public static void getASCII(List<Character> list){
        for (Character s : list) {
         System.out.println((int)s);
        }
    }
//    4. Перебор List<String[]> и вывод первого элемента каждого подмассива.
    public static void getFirstElement(List<String[]> list){
        for (String[] strings : list) {
            System.out.println(strings[0]);
        }
    }
//    5. Перебор List<List<String>> и вывод всех элементов вложенных списков.
    public static void printAllElement(List<List<String>> list){
        for (List<String> l: list) {
            for (String str: l) {
                System.out.println(str);
            }
        }
    }
//    6. Перебор List<Integer> и вывод только четных чисел.
    public static void getEven(List<Integer> list){
        for (int i: list) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
//    7. Перебор List<String> и вывод слов, начинающихся на определенную букву.
    public static void getFirstLetter(List<String> list, char ch){
        for (String str: list) {
           if(str.charAt(0) == ch){
               System.out.println(str);
           }
        }
    }
//    8. Перебор List<Character> и подсчет количества гласных.
    public static int getCount(List<Character> list){
        int count = 0;
        for (char ch:  list) {
            if(isVowel(ch)){
                count++;
            }
        }
        return count;
    }
    //метод проверяет, гласная ли буква
     public static boolean isVowel(char c){
        char[] vowels = new char[]{'a', 'e', 'u', 'o', 'i', 'y'};
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }

//    9. Перебор List<String[]>, вывод длины каждого подмассива.
    public static void getLength(List<String[]> list){
        for (String[] strings: list) {
            System.out.println(strings.length);
        }
    }

//    10. Перебор List<List<Integer>>, подсчет суммы всех чисел.
    public static int getSum(List<List<Integer>> list){
        int sum = 0;
        for (List<Integer> ls: list) {
            for (int i: ls) {
                sum += i;
            }
        }
        return sum;
    }
//    11. Перебор List<List<Integer>> и вывод только тех списков, сумма элементов которых больше 10.
    public static void getMoreThanTen(List<List<Integer>> list){
        for (List<Integer> ls: list) {
            int sum = 0;
            for (int i: ls) {
                sum += i;
            }
            if(sum > 0) System.out.println(ls);
        }
    }
//    12. Перебор List<String> и подсчет количества слов определенной длины.
    public static int getCountOfWords(List<String> list, int length){
        int count = 0;
        for (String str: list) {
            if(str.length() == length) count++;
        }
        return count;
    }

//    13. Перебор List<Integer[]> и нахождение максимального элемента в каждом массиве.
    public static void getMax(List<Integer[]> list){
        for (Integer[] list1: list) {
           int temp = Integer.MIN_VALUE;
            for (int i = 0; i < list1.length; i++) {
               if(i > temp) temp = i;
            }
            System.out.println(temp);
        }
    }

//    14. Перебор List<List<String>>, вывод всех комбинаций строк из разных вложенных списков.
    public static void getCombine(List<List<String>> list){
        List<String> list1= new ArrayList<>();
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            list1.addAll(index, list.get(i));
            index += list.size();
        }
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if(i != j) System.out.println(list1.get(i) + list1.get(j));
            }
        }
    }

//    15. Перебор List<Integer> и нахождение всех пар чисел, сумма которых равна 10.
    public static void getSumTen(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(i != j && list.get(i) + list.get(j) == 10) System.out.println(list.get(i) + " + " + list.get(j) + " = 10");
            }
        }
    }

//    16. Перебор List<String> и создание нового списка, содержащего только уникальные элементы.
    public static List<String> getUniqueString(List<String> list){
        List<String> unique = new ArrayList<>();
        for (String s : list) {
            if (!unique.contains(s)) unique.add(s);
        }
        return unique;
    }

//    17. Перебор List<Character> и перестановка элементов в обратном порядке.
    public static List<Character> getBack(List<Character> list){
        List<Character> back = new ArrayList<>();
        int i = list.size()-1;
        while (i >= 0) {
            back.add(list.get(i));
            i--;
        }
        return back;
    }

//    18. Перебор List<List<Integer>> и вывод тех вложенных списков, которые содержат повторяющиеся элементы.
    public static void getRepeat(List<List<Integer>> list){
        for (List<Integer> list1: list) {
            for (int i = 0; i < list1.size(); i++) {
                int temp = list1.get(i);
                list1.remove(list1.get(i));
                if (list1.contains(temp)){
                    list1.add(i, temp);
                    System.out.println(list1);
                    break;
                }
                list1.add(i, temp);
            }
        }
    }

//    19. Перебор List<Integer> и нахождение всех подмножеств этого списка.
//static List<List<Integer>> generateSubsets(List<Integer> nums) {
//    List<List<Integer>> result = new ArrayList<>();
//    generateSubsetsHelper(nums, 0, new ArrayList<>(), result);
//    return result;
//}
//
//    public static void generateSubsetsHelper(List<Integer> nums, int index, List<Integer> current, List<List<Integer>> result) {
//        // Добавить текущее подмножество в результат
//        result.add(new ArrayList<>(current));
//
//        // Рекурсивно генерировать подмножества, начиная с текущего индекса
//        for (int i = index; i < nums.size(); i++) {
//            // Добавить элемент в текущее подмножество
//            current.add(nums.get(i));
//
//            // Рекурсивно вызвать для следующего индекса
//            generateSubsetsHelper(nums, i + 1, current, result);
//
//            // Удалить последний добавленный элемент для перехода к следующему подмножеству
//            current.remove(current.size() - 1);
//        }
//    }


//    20. Перебор List<String> и создание всех возможных комбинаций строк без повторений.

//    21. Перебор List<List<Integer>> и нахождение списка с максимальной суммой элементов.
    public static List<Integer> getMaxSum(List<List<Integer>> list){
        List<Integer> listWithMaxSum = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;
        for (List<Integer> integers : list) {
            int tempSum = 0;
            for (Integer integer : integers) {
                tempSum += integer;
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                listWithMaxSum = integers;
            }
        }
        return listWithMaxSum;
    }

//    22. Перебор List<Character> и построение всех возможных строк из данных символов.
}



