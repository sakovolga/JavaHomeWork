package de.telran.HomeTask211223;

import com.github.javafaker.Faker;

import java.util.*;

public class Main {
    final public static Faker FAKER = new Faker();
    final public static Random RANDOM = new Random();
    public static void main(String[] args) {
//    1 **Создайте HashMap<String, Integer>, заполните его парами
//    "имя-возраст". Используйте цикл for-each для удвоения возраста каждого человека.
        System.out.println("-------------1-------------");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 23);
        map.put("Nick", 25);
        map.put("Elen", 20);
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()*2);
        }

//        2. ***Создайте HashMap<Integer, String>, представляющий
//        "ID-имя пользователя". Используйте цикл для фильтрации
//        пользователей с ID больше 100 и копируйте их в TreeMap.
        System.out.println("------------2------------");
        HashMap<Integer, String> map1 = new HashMap<>();
        for (int i = 0; i < 20; i++){
            map1.put(RANDOM.nextInt(200), String.valueOf(FAKER.name().firstName()));
        }
        TreeMap<Integer, String> map2 = new TreeMap<>();
        for (Map.Entry<Integer, String> pare: map1.entrySet()) {
            if(pare.getKey() > 100){
                map2.put(pare.getKey(), pare.getValue());
            }
        }
        for(Map.Entry<Integer, String> pare: map2.entrySet()){
            System.out.println(pare);
        }

//        3**Создайте класс User с полями name и age, реализующий Comparable
//        для сортировки по возрасту. Используйте TreeMap<User, String>
//        для хранения информации о пользователях и переберите его, чтобы напечатать имена.
        System.out.println("-----------3-------------");
        TreeMap<User, String> map3 = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            map3.put(new User(String.valueOf(FAKER.name().firstName()), RANDOM.nextInt(50)), String.valueOf(FAKER.address()));
        }
        for(Map.Entry<User, String> pare: map3.entrySet()){
            System.out.println(pare.getKey().getName());
        }

//        4**Создайте TreeMap<User, String> (класс User как в задаче 3), но на
//        этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.
        System.out.println("-----------4-------------");
        UserComparator userComparator = new UserComparator();
        TreeMap<User, String> map4 = new TreeMap<>(userComparator);
        for (int i = 0; i < 10; i++) {
            map4.put(new User(String.valueOf(FAKER.name().firstName()), RANDOM.nextInt(50)), String.valueOf(FAKER.address()));
        }
        for(Map.Entry<User, String> pare: map4.entrySet()){
            System.out.println(pare.getKey().getName());
        }

//        5**Создайте два HashMap<String, User> (класс User как в задаче 3) и
//        объедините их в один, удалив дубликаты пользователей.
        System.out.println("-----------5-------------");
        HashMap<String, User> map5 = new HashMap<>();
        map5.put("London", new User("Jack", 50));
        map5.put("Paris", new User("Svetlana", 31));
        map5.put("Hamburg", new User("Jack", 13));

        HashMap<String, User> map6 = new HashMap<>();
        map6.put("Bern", new User("Richard", 47));
        map6.put("Berlin", new User("Svetlana", 13));
        map6.put("Oslo", new User("Svetlana", 50));

        HashMap<String, User> unitedMap = new HashMap<>(map5);
        unitedMap.putAll(map6);

        System.out.println(Solution.removeDoublesHashMap(unitedMap));

//        6**Создайте HashMap<Integer, String> и перепишите его в TreeMap<String, Integer>,
//                инвертируя ключи и значения.
        System.out.println("-----------6-------------");
        HashMap<Integer, String> map7 = new HashMap<>(map1);
        TreeMap<String, Integer> map8 = new TreeMap<>();
        for (Map.Entry<Integer, String> entry: map7.entrySet()){
            map8.put(entry.getValue(), entry.getKey());
        }
        System.out.println(map7);
        System.out.println(map8);

//      7**Создайте HashMap<String, Integer>, переберите её и создайте List<Integer>,
//                содержащий все значения HashMap.
        System.out.println("-----------7-------------");
        HashMap<String, Integer> map9 = new HashMap<>(map);
        List<Integer> li = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map9.entrySet()){
            li.add(entry.getValue());
        }
        System.out.println(li);

//        8**Создайте TreeMap<String, Integer> и переберите его, создавая HashMap<Integer, String>,
//        включающий только те записи, где значение больше 50.
        System.out.println("-----------8-------------");
        TreeMap<String, Integer> map10 = new TreeMap<>();
        for(int i = 0; i < 20; i++){
           map10.put(FAKER.name().firstName(), RANDOM.nextInt(100));
        }
        HashMap<Integer, String> map11 = new HashMap<>();
        for(Map.Entry<String, Integer> entry: map10.entrySet()){
            if(entry.getValue() > 50){
                map11.put(entry.getValue(), entry.getKey());
            }
        }
        System.out.println(map11);

//        9**Создайте HashMap<String, List<Integer>>, где ключ - это имя, а значение - список оценок.
//                Используйте TreeMap<Integer, List<String>> для создания отображения
//        "средняя оценка - список студентов с этой оценкой".
        System.out.println("-----------9-------------");
        HashMap<String, List<Integer>> map12 = new HashMap<>();
        for(int i = 0; i < 30; i++){
            String name = FAKER.name().fullName();
            List<Integer> grades = new ArrayList<>();
            for(int j = 0; j < 10; j++){
                grades.add(RANDOM.nextInt(11 - 1) + 1);
            }
            map12.put(name, grades);
        }
        HashMap<String, Integer> average = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry: map12.entrySet()){
            Integer sumGrade = 0;
            for (Integer integer: entry.getValue()){
                sumGrade += integer;
            }
            Integer averageGrade = sumGrade / 10;
            average.put(entry.getKey(), averageGrade);
        }
        TreeMap<Integer, List<String>> averageGradesWithStudents = new TreeMap<>();
        for (int i = 1; i <= 10; i++){
            List<String> students = new ArrayList<>();
            for (Map.Entry<String, Integer> entry: average.entrySet()){
                if (entry.getValue() == i){
                    students.add(entry.getKey());
                }
            }
            if (!students.isEmpty()){
                averageGradesWithStudents.put(i, students);
            }
        }
        System.out.println(averageGradesWithStudents);
    }

}
