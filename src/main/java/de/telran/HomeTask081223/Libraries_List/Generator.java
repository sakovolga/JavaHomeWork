package de.telran.HomeTask081223.Libraries_List;

import com.github.javafaker.Faker;
//import de.telran.HomeTask081223.Libraries_Array.Book;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
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

    public static List<Book> bookGenerator(int bookNumbers) {
        List<Book> books = new ArrayList<>(bookNumbers);
        for (int i = 0; i < bookNumbers; i++) {
            books.add(new Book(FAKER.book().author(),
                                FAKER.book().title(),
                                bookIssueDate(),
                                randomConditionGen(),
                                isEbookRandomGen()));
        }
        return books;
    }

       private static int bookIssueDate() {
        return RANDOM.nextInt(2022-1900)+1900;

    }

    public static List<Library> libraryGen(int librariesNumber) {
        List<Library> libraries = new ArrayList<>();
        int bookNumber = 10;
        for (int i = 0; i < librariesNumber; i++) {
            libraries.add(new Library(FAKER.address().fullAddress(),
                                    bookNumber,
                                    bookGenerator(bookNumber)));
        }
        return libraries;
    }
}