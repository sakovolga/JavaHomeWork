package de.telran.HomeTask191223;

import java.util.*;

public class Handler {
//    1. HashMap<String, String>: Найдите количество пар ключ-значение, где длина ключа равна длине значения.
    public static int getQuantity(HashMap<String, String> map){
        int count = 0;
             for (Map.Entry<String, String> m: map.entrySet()) {
                 if (m.getKey().length() == m.getValue().length()) {
                     count++;
                 }
             }
             return count;
    }

//    2. HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.
    public static int getSum(HashMap<String, Integer> map){
        int sum = 0;
        for (Map.Entry<String, Integer> m: map.entrySet()) {
            if (m.getKey().startsWith("A") || m.getKey().startsWith("a")) {
                sum += m.getValue();
            }
        }
        return sum;
    }
//
//    3. HashMap<Integer, List<String>>: Для каждого ключа выведите все строки из соответствующего списка,
//    которые начинаются с гласной буквы.
    public static void getStringStartingWithLetter(HashMap<String, List<String>> map){
        for (Map.Entry<String, List<String>> m: map.entrySet()) {
            System.out.println(m.getKey() + ": ");
            for (String str: m.getValue()) {
                if(str.startsWith("A") || str.startsWith("O") || str.startsWith("I") ||
                   str.startsWith("Y") || str.startsWith("E") || str.startsWith("U")){
                    System.out.println(str);
                }
            }
        }
    }

//    4. HashMap<Integer, Integer>: Найдите ключ с максимальным значением и выведите эту пару.
    public static void getMaxValue(HashMap<Integer, Integer> map){
        int maxKey = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            if(m.getValue() > maxValue){
                maxValue = m.getValue();
                maxKey = m.getKey();
            }
        }
        System.out.println(maxKey + ": " + maxValue);
    }

//    5. HashMap<String, String>: Определите, содержит ли HashMap такую пару ключ-значение,
//    где ключ является обратной строкой
//    значения (например, ключ "abc", значение "cba").
    public static boolean isContainsBackValue(HashMap<String, String> map){
        for(Map.Entry<String, String> str: map.entrySet()){
            StringBuilder key = new StringBuilder(str.getKey());
            StringBuilder value = new StringBuilder(str.getValue());
            if(key.compareTo(value.reverse()) == 0){
                return true;
            }
        }
        return false;
    }
//
//    6. HashMap<String, Integer>: Переберите HashMap и преобразуйте его в HashMap<String, String>,
//    где каждое значение - это строковое представление исходного числа, умноженного на 2.
    public static HashMap<String, String> doIntegerx2(HashMap<String, Integer> map){
        HashMap<String, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> pare: map.entrySet()) {
            Integer integer = pare.getValue()*2;
            String string = integer.toString();
            newMap.put(pare.getKey(), string);
        }
        return newMap;
    }

//    7. HashMap<Integer, List<String>>: Создайте второй HashMap<Integer, Integer>,
//    где каждый ключ - это ключ из исходного HashMap,
//    а значение - общее количество символов во всех строках списка этого ключа.
    public static HashMap<Integer, Integer> getSumString(HashMap<Integer, List<String>> map){
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for(Map.Entry<Integer, List<String>> pare: map.entrySet()){
            newMap.put(pare.getKey(), getSumOfStrings(pare.getValue()));
        }
        return newMap;
    }

    public static Integer getSumOfStrings(List<String> stringList){
        int sum = 0;
        for(String str: stringList){
            sum += str.length();
        }
        return sum;
    }

//    8. HashMap<Integer, Integer>: Найдите все пары ключ-значение, где ключ минус значение является простым числом.
    public static HashMap<Integer, Integer> findSimpleDifference(HashMap<Integer, Integer> map){
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for(Map.Entry<Integer, Integer> pare: map.entrySet()){
//            int difference = pare.getKey() - pare.getValue();
            if(isSimple(pare.getKey() - pare.getValue())){
                newMap.put(pare.getKey(), pare.getValue());
            }
        }
        return newMap;
    }

    public static boolean isSimple(int num){
        int newNum = Math.abs(num);
        if (newNum == 1 || newNum == 0) return false;
        for(int i = 2; i < newNum; i++){
            if(newNum % i == 0){
                return false;
            }
        }
        return true;
    }

//    9. HashMap<String, String>: Определите, можно ли преобразовать HashMap в List<String>,
//    где каждый элемент - это конкатенация ключа и значения, так, чтобы все элементы списка были уникальными.

    public static boolean isUniqueListString(HashMap<String, String> map){
        List<String> stringList = conwerseToList(map);
        for(int i = 0; i < stringList.size(); i++){
            stringList.remove(stringList.get(i));
            if(stringList.contains(stringList.get(i))){
               return false;
            }
        }
        return true;
    }
    public static List<String> conwerseToList(HashMap<String, String> map){
        List<String> stringList = new ArrayList<>();
        for(Map.Entry<String, String> pare: map.entrySet()){
            stringList.add(pare.getKey() + pare.getValue());
        }
        return stringList;
    }

//    10. HashMap<String, Integer> и HashMap<Integer, List<String>>: Для каждого ключа в HashMap<String, Integer>
//    найдите соответствующие строки в HashMap<Integer, List<String>>,
//    где ключ во втором HashMap - это значение из первого, и выведите их.
    public static void findAccordance(HashMap<String, Integer> map1, HashMap<Integer, List<String>> map2){
        for (Map.Entry<String, Integer> pare1: map1.entrySet()){
            for (Map.Entry<Integer, List<String>> pare2: map2.entrySet()){
                if(isExistStringInList(pare2.getValue(), pare1.getKey())){
                    if(Objects.equals(pare1.getValue(), pare2.getKey())){
                        System.out.println(pare1.getKey());
                    }
                }
            }
        }
    }
    public static boolean isExistStringInList(List<String> strings, String str){
        for (String a: strings){
            if (str.equals(a)) return true;
        }
        return false;
    }

//    11. Написать метод, который вытягивает ключ по значению, если ключей много то все ключи
    public static void findAllKeys(HashMap<Integer, Integer> map, int foundedValue){
        for(Map.Entry<Integer, Integer> pare: map.entrySet()){
            if(pare.getValue().equals(foundedValue)){
                System.out.println(pare);
            }
        }
    }
}
