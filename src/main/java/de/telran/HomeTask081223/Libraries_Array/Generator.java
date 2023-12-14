package de.telran.HomeTask081223.Libraries_Array;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class Generator {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();



    private static Condition randomConditionGen() {
        Condition[] conditions = Condition.values(); //new old damaged
        int index = RANDOM.nextInt(3);
        return conditions[index];
    }

    private static boolean isEbookRandomGen() {
        boolean[] isEbook = {true, false};
        int index = RANDOM.nextInt(2);
        return isEbook[index];
    }

    public static Book oneBookGenerator() {
        return new Book(FAKER.book().author(),
                FAKER.book().title(),
                bookIssueDate(),
                randomConditionGen(),
                isEbookRandomGen());
    }

    public static Book[] bookGenerator(int bookNumbers) {
        Book[] books = new Book[bookNumbers];
        for (int i = 0; i < bookNumbers; i++) {
            books[i] = new Book(FAKER.book().author(),
                                FAKER.book().title(),
                                bookIssueDate(),
                                randomConditionGen(),
                                isEbookRandomGen());
        }
        return books;
    }


    //todo
    private static int bookIssueDate() {
        return RANDOM.nextInt(2022-1900)+1900;

    }

    public static Library[] libraryGen() {
        Library[] libraries = new Library[5];// l1 l2 l3 l4 l5
        int bookNumber = 5;
        for (int i =0; i < libraries.length; i++) {
            libraries[i] = new Library(FAKER.address().fullAddress(), bookNumber, bookGenerator(bookNumber));
        }
        return libraries;
    }
}