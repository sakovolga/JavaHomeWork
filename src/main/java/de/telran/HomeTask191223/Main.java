package de.telran.HomeTask191223;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static de.telran.HomeTask191223.Handler.getQuantity;

public class Main {
    public static void main(String[] args) {
//    1. HashMap<String, String>: Найдите количество пар ключ-значение, где длина ключа равна длине значения.
//        HashMap<String, String> map = new HashMap<>();
//        map.put("Apple", "Red");
//        map.put("Banana", "Yellow");
//        map.put("Orange", "Orange");
//        map.put("Grapes", "Purple");
//        map.put("Kiwi", "Brown");
//        int result = getQuantity(map);
//        System.out.println("Number of keys with the same length as their values: " + result);

//    2. HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Apple", 10);
//        map.put("Banana", 5);
//        map.put("Orange", 8);
//        map.put("Grapes", 12);
//        map.put("kiwi", 3);
//        int result = Handler.getSum(map);
//        System.out.println("Sum of values for keys starting with 'A' or 'a': " + result);

//    3. HashMap<Integer, List<String>>: Для каждого ключа выведите все строки из соответствующего списка,
//    которые начинаются с гласной буквы.
//        HashMap<String, List<String>> map = new HashMap<>();
//        map.put("Cities", List.of("Amsterdam", "Oslo", "Indianapolis", "Yerevan", "Ulaanbaatar"));
//        map.put("Fruits", List.of("Apple", "Orange", "Mango", "Banana", "Watermelon"));
//        map.put("Colors", List.of("Orange", "Yellow", "Indigo", "Purple", "Ultramarine"));
//        Handler.getStringStartingWithLetter(map);

//    4. HashMap<Integer, Integer>: Найдите ключ с максимальным значением и выведите эту пару.
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(1, 10);
//        map.put(2, 5);
//        map.put(3, 8);
//        map.put(4, 3);
//        Handler.getMaxValue(map);

//    5. HashMap<String, String>: Определите, содержит ли HashMap такую пару ключ-значение,
//    где ключ является обратной строкой
//        HashMap<String, String> map3 = new HashMap<>();
//        map3.put("racecar", "racecar");
//        map3.put("apple", "oelppa");
//        System.out.println(Handler.isContainsBackValue(map3));

//    6. HashMap<String, Integer>: Переберите HashMap и преобразуйте его в HashMap<String, String>,
//    где каждое значение - это строковое представление исходного числа, умноженного на 2.
//        HashMap<String, Integer> map1 = new HashMap<>();
//        map1.put("value1", 5);
//        map1.put("value2", 10);
//        map1.put("value3", 7);
//
//        HashMap<String, String> result1 = Handler.doIntegerx2(map1);
//        System.out.println(result1);

//    7. HashMap<Integer, List<String>>: Создайте второй HashMap<Integer, Integer>,
//    где каждый ключ - это ключ из исходного HashMap,
//    а значение - общее количество символов во всех строках списка этого ключа.
//        HashMap<Integer, List<String>> inputMap = new HashMap<>();
//        inputMap.put(1, new ArrayList<>(List.of("apple", "banana", "orange")));
//        inputMap.put(2, new ArrayList<>(List.of("cat", "dog", "elephant")));
//        inputMap.put(3, new ArrayList<>(List.of("sun", "moon", "star")));
//        System.out.println(Handler.getSumString(inputMap));

//    8. HashMap<Integer, Integer>: Найдите все пары ключ-значение, где ключ минус значение является простым числом.
//        HashMap<Integer, Integer> inputMap = new HashMap<>();
//        inputMap.put(5, 3);
//        inputMap.put(10, 3);
//        inputMap.put(15, 7);
//        inputMap.put(8, 4);
//        HashMap<Integer, Integer> result = Handler.findSimpleDifference(inputMap);
//        System.out.println(result);

//    9. HashMap<String, String>: Определите, можно ли преобразовать HashMap в List<String>,
//    где каждый элемент - это конкатенация ключа и значения, так, чтобы все элементы списка были уникальными.
//        HashMap<String, String> inputMap = new HashMap<>();
//        inputMap.put("key1", "value1");
//        inputMap.put("key1", "value1");
//        inputMap.put("key2", "value2");
//        inputMap.put("key3", "value3");
//        boolean result = Handler.isUniqueListString(inputMap);
//        System.out.println(result);

//    10. HashMap<String, Integer> и HashMap<Integer, List<String>>: Для каждого ключа в HashMap<String, Integer>
//    найдите соответствующие строки в HashMap<Integer, List<String>>,
//    где ключ во втором HashMap - это значение из первого, и выведите их.
//        HashMap<String, Integer> map1 = new HashMap<>();
//        HashMap<Integer, List<String>> map2 = new HashMap<>();
//        map1.put("ключ1", 1);
//        map1.put("ключ2", 2);
//        map1.put("ключ3", 3);
//        map2.put(1, List.of("значение1а", "значение1б"));
//        map2.put(2, List.of("значение2а", "ключ2"));
//        map2.put(3, List.of("значение3а", "значение3б"));
//        Handler.findAccordance(map1, map2);

//    11. Написать метод, который вытягивает ключ по значению, если ключей много то все ключи
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(1, 10);
//        map.put(2, 20);
//        map.put(3, 30);
//        map.put(4, 20);
//        map.put(5, 40);
//        Handler.findAllKeys(map, 20);
    }
}
