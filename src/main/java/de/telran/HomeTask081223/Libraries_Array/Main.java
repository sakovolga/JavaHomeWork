package de.telran.HomeTask081223.Libraries_Array;

import lombok.ToString;

import java.util.Arrays;

public class Main {
    private static final Library[] LIBRARIES = Generator.libraryGen();

    public static void main(String[] args) {
//        1. Вывести все адреса библиотек
//        Handler.printAllAddresses(LIBRARIES);

//     2. Подсчитать общее количество книг во всех библиотеках
//        Handler.printTotalBookCount(LIBRARIES);

//     3. Вывести названия всех книг в библиотеке
        //Handler.printAllBookNames(LIBRARIES[0]);

//    4. Найти библиотеки, где есть электронные книги
//       Book book = Generator.oneBookGenerator();
//        System.out.println(book);
//        Book[] books = Generator.bookGenerator(20);
//        for (Book value : books) {
//            System.out.println(value);
//        }
//        Handler.printLibrariesWithEBooks(Generator.libraryGen());

//    5. Вывести книги в заданном состоянии
//        Handler.printBooksByCondition(Generator.libraryGen(), Condition.OLD);

//        6. Вывести список библиотек с количеством книг больше заданного
//        Handler.printLibrariesWithMoreThanXBooks(Generator.libraryGen(), 3);

//        7. Вывести книги, изданные до заданного года
//        Handler.printBooksIssuedBeforeYear(Generator.libraryGen(), 2005);

//       8. Вывести авторов книг в алфавитном порядке
//       Handler.printAuthorsAlphabetically(Generator.libraryGen());

//     9. Вывести библиотеки, которые не имеют книг
//        Handler.printLibrariesWithoutBooks(Generator.libraryGen());

//         10. Вывести книги, названия которых начинаются на заданную букву
//        Handler.printBooksStartingWithLetter(Generator.libraryGen(), 'A');

//         11. Вывести библиотеки по убыванию количества книг ???
//        Library[] libraries = new Library[]{
//                new Library("", 2, Generator.bookGenerator(2)),
//                new Library("", 3, Generator.bookGenerator(3)),
//                new Library("", 1, Generator.bookGenerator(1)),
//                new Library("", 5, Generator.bookGenerator(5)),
//        };
//        Handler.printLibrariesByDescendingBookCount(libraries);

//     12. Вывести авторов и количество их книг в каждой библиотеке
//        Library[] libraries = new Library[]{
//                new Library("", 2, Generator.bookGenerator(2)),
//                new Library("", 3, Generator.bookGenerator(3)),
//                new Library("", 1, Generator.bookGenerator(1)),
//                new Library("", 5, Generator.bookGenerator(5)),
//        };
//        Book book1 = new Book("John Smith", "Lake", 1950, Condition.NEW, true);
//        Book book2 = new Book("John Smith", "Snow", 1940, Condition.NEW, true);
//        Book book3 = new Book("John Smith", "Age", 1958, Condition.NEW, true);
//        libraries[1].getBooks()[0] = book1;
//        libraries[1].getBooks()[1] = book2;
//        libraries[1].getBooks()[2] = book3;
//
//
//         Handler.printAuthorsAndTheirBookCounts(libraries);

//     13. Вывести наиболее часто встречающееся состояние книг
//        Handler.printMostCommonBookCondition(Generator.libraryGen());

//     14. Вывести библиотеки, где нет поврежденных книг
//        Library[] libraries = new Library[]{
//                new Library("", 2, Generator.bookGenerator(2)),
//                new Library("", 3, Generator.bookGenerator(3)),
//                new Library("", 1, Generator.bookGenerator(1)),
//                new Library("", 5, Generator.bookGenerator(5)),
//        };
//        Handler.printLibrariesWithoutDamagedBooks(libraries);

//     15. Вывести все уникальные года издания книг
//        Handler.printUniqueIssueYears(Generator.libraryGen());

//       16. Вывести книги сортированные по году издания в каждой библиотеке
//        Handler.printBooksSortedByIssueYear(Generator.libraryGen());

//   17. Вывести количество библиотек, где есть хотя бы одна электронная книга
//        Library[] libraries = new Library[]{
//                new Library("", 2, Generator.bookGenerator(2)),
//                new Library("", 3, Generator.bookGenerator(1)),
//                new Library("", 1, Generator.bookGenerator(1)),
//                new Library("", 5, Generator.bookGenerator(1)),
//        };
//        Handler.printCountOfLibrariesWithAtLeastOneEBook(libraries);

//        18. Вывести книги, чьё название содержит определённое слово
//        Handler.printBooksContainingWord(Generator.libraryGen(), "the");

//     19. Вывести пары "Автор - Самая старая книга"
//        Library[] libraries = Generator.libraryGen();
//        Book book1 = new Book("John Malkowich", "A", 1950, Condition.NEW, true);
//        Book book2 = new Book("John Malkowich", "B", 1951, Condition.NEW, true);
//        Book book3 = new Book("John Malkowich", "C", 1945, Condition.NEW, true);
//        Book[] books = {book1, book2, book3};
//        libraries[0].setBooks(books);
//        Handler.printAuthorsWithOldestBooks(libraries);

//      20. Вывести библиотеки, в которых каждая книга - электронная
//        Library[] libraries = new Library[]{
//                new Library("", 2, Generator.bookGenerator(2)),
//                new Library("", 1, Generator.bookGenerator(1)),
//                new Library("", 1, Generator.bookGenerator(1)),
//                new Library("", 1, Generator.bookGenerator(1)),
//        };
//        Handler.printLibrariesWithAllEBooks(libraries);
    }
}