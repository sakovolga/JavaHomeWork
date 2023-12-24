package de.telran.HomeTask211223;

import lombok.Getter;

import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User>{
    @Getter
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + '}';
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}

