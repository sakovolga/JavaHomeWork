package de.telran.HomeTask081223.Libraries_Array;
import java.util.Arrays;
import java.util.Objects;

public class Handler {
//    1. Вывести все адреса библиотек
    public static void printAllAddresses(Library[] libraries) {
        for (Library library : libraries) {
            System.out.println(library.getAddress());
        }
    }

//     2. Подсчитать общее количество книг во всех библиотеках
     public static void printTotalBookCount(Library[] libraries) {
         int bookCount = 0;
         for (Library library : libraries) {
             int count = library.getBooks().length;
             bookCount = bookCount + count;
         }
         System.out.println("ALL BOOKS NUMBER IS: " + bookCount);
     }

//     3. Вывести названия всех книг в библиотеке
      public static void printAllBookNames(Library library) {
          for (int i = 0; i < library.getBooks().length; i++) {
              System.out.println(library.getBooks()[i].getName());
          }
      }

//    4. Найти библиотеки, где есть электронные книги
    public static void printLibrariesWithEBooks(Library[] libraries){
        for (int i = 0; i < libraries.length; i++) {
            for (int j = 0; j < libraries[i].getBooks().length; j++) {
                if (libraries[i].getBooks()[j].isEBOOK()) {
                    System.out.println("Library " + i + " has EBooks");
                    break;
                }
            }
        }
    }
//    5. Вывести книги в заданном состоянии
    public static void printBooksByCondition(Library[] libraries, Condition condition) {
        for (Library library : libraries) {
            for (int j = 0; j < library.getBooks().length; j++) {
                if (library.getBooks()[j].getCondition() == condition) {
                    System.out.println(library.getBooks()[j]);
                }
            }
        }
    }

//        6. Вывести список библиотек с количеством книг больше заданного
        public static void printLibrariesWithMoreThanXBooks(Library[] libraries, long count) {
            for (Library library : libraries)
                if (count < library.getBooks().length) {
                    System.out.println("Library with address " + library.getAddress() + " has more than " + count + " books");
                }
        }

//        7. Вывести книги, изданные до заданного года
        public static void printBooksIssuedBeforeYear(Library[] libraries, int year) {
            for (Library library : libraries) {
                for (int j = 0; j < library.getBooks().length; j++) {
                    if (library.getBooks()[j].getIssueYear() > year) {
                        System.out.println(library.getBooks()[j]);
                    }
                }
            }
        }

//       8. Вывести авторов книг в алфавитном порядке
    public static void printAuthorsAlphabetically(Library[] libraries){
        Book[] books = combineLibraries(libraries);
        boolean unsorted = true;
        Book temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < books.length - 1; i++) {
                if (books[i + 1].getAuthor().toLowerCase().compareTo(books[i].getAuthor().toLowerCase()) < 0) {
                    temp = books[i];
                    books[i] = books[i + 1];
                    books[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        for (Book book: books) {
            System.out.println(book.getAuthor());
        }
    }

    public static Book[] combineLibraries(Library[] libraries) {
        int sizeOfCombinedArray = 0;
        for (Library library : libraries) {
            sizeOfCombinedArray += library.getBooks().length;
        }
        Book[] combinedBooks = new Book[sizeOfCombinedArray];
        int count = 0;
        for (Library library : libraries) {
            Book[] books = library.getBooks();
            System.arraycopy(books, 0, combinedBooks, count, books.length);
            count += books.length;
        }
        return combinedBooks;
    }

//     9. Вывести библиотеки, которые не имеют книг

    public static void printLibrariesWithoutBooks(Library[] libraries) {
        for (Library library : libraries)
            if (library.getBooks().length == 0) {
                System.out.println("Library with address " + library.getAddress() + " don't has books");
            }
    }

//         10. Вывести книги, названия которых начинаются на заданную букву
          public static void printBooksStartingWithLetter(Library[] libraries, char letter) {
              System.out.println("Books starting With " + letter + " :");
              for (Library library : libraries) {
                  for (int j = 0; j < library.getBooks().length; j++) {
                      if (library.getBooks()[j].getName().startsWith(String.valueOf(letter)))
                          System.out.println(library.getBooks()[j]);
                  }
              }
          }


//         11. Вывести библиотеки по убыванию количества книг
    public static void printLibrariesByDescendingBookCount(Library[] libraries) {
        boolean unsorted = true;
        Library temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < libraries.length - 1; i++) {
                if (libraries[i].getBooks().length < libraries[i + 1].getBooks().length) {
                    temp = libraries[i];
                    libraries[i] = libraries[i + 1];
                    libraries[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        for (int i = 0; i < libraries.length; i++) {
            System.out.println("library " + i + " - " + libraries[i].getBooks().length + " books");
        }
    }

//     12. Вывести авторов и количество их книг в каждой библиотеке
    public static void printAuthorsAndTheirBookCounts(Library[] libraries) {
        for (int i = 0; i < libraries.length; i++) {
            for (int j = 0; j < libraries[i].getBooks().length; j++) {
                String concreteAuthor = libraries[i].getBooks()[j].getAuthor();
                int countOfHisBooks = 0;
                for (int k = 0; k < libraries[i].getBooks().length; k++){
                    if (libraries[i].getBooks()[k].getAuthor().equals(concreteAuthor)){
                        countOfHisBooks++;
                    }
                }
                System.out.println(concreteAuthor + " - " + countOfHisBooks + " in library " + i);
            }
        }
    }

    //     13. Вывести наиболее часто встречающееся состояние книг
    public static void printMostCommonBookCondition(Library[] libraries) {
         int countOfNew = 0;
         int countOfOld = 0;
         int countOfDamaged = 0;
        for (Library library : libraries) {
            for (int j = 0; j < library.getBooks().length; j++) {
                if (library.getBooks()[j].getCondition() == Condition.DAMAGED) {
                    countOfDamaged++;
                } else if (library.getBooks()[j].getCondition() == Condition.NEW) {
                    countOfNew++;
                } else if (library.getBooks()[j].getCondition() == Condition.OLD) {
                    countOfOld++;
                }
            }
        }
        if (countOfNew > countOfOld && countOfNew >= countOfDamaged){
            System.out.println("NEW is most common book condition");
        } else if (countOfOld > countOfNew && countOfOld > countOfDamaged) {
            System.out.println("OLD is most common book condition");
        } else if (countOfDamaged > countOfNew && countOfDamaged > countOfOld) {
            System.out.println("DAMAGED is most common book condition");
        } else if (countOfNew == countOfOld && countOfNew > countOfDamaged) {
            System.out.println("NEW and OLD is most common book condition");
        } else if (countOfOld > countOfNew && countOfOld == countOfDamaged) {
            System.out.println("DAMAGED and OLD is most common book condition");
        } else if (countOfDamaged == countOfNew && countOfDamaged > countOfOld) {
            System.out.println("DAMAGED and NEW is most common book condition");
        } else if (countOfDamaged == countOfNew && countOfDamaged == countOfOld) {
            System.out.println("DAMAGED, OLD and NEW is most common book condition");
        }

    }

    //     14. Вывести библиотеки, где нет поврежденных книг
    public static void printLibrariesWithoutDamagedBooks(Library[] libraries) {
        for (int i = 0; i < libraries.length; i++) {
            int countOfDamaged = 0;
            for (int j = 0; j < libraries[i].getBooks().length; j++) {
                if (libraries[i].getBooks()[j].getCondition() == Condition.DAMAGED) {
                    countOfDamaged++;
                    break;
                }
            }
            if (countOfDamaged == 0){
                System.out.println("Library " + i + " hasn't damaged books");
            }
        }

    }

//     15. Вывести все уникальные года издания книг
         public static void printUniqueIssueYears(Library[] libraries){
             int[] years = new int[calculateAuthorsLength(libraries)];
             int index = 0;
             for (Library library : libraries) {
                 for (int j = 0; j < library.getBooks().length; j++) {
                     if (!isContainInArray(library.getBooks()[j].getIssueYear(), years)) {
                         years[index] = library.getBooks()[j].getIssueYear();
                         System.out.println(years[index]);
                         index++;
                     }
                 }
             }

         }

    public static boolean isContainInArray(int founded, int[] arr){
        for(int s: arr) {
            if(s == founded) {
                return true;
            }
        }
        return false;
    }

         /** 16. Вывести книги сортированные по году издания в каждой библиотеке */

         public static void printBooksSortedByIssueYear(Library[] libraries) {
             for (int i = 0; i < libraries.length; i++) {
                 System.out.println("library " + i + " was sorted by issue year");
                 bubbleSort(libraries[i].getBooks());
                 for (Book book: libraries[i].getBooks()) {
                     System.out.println(book);
                 }
             }
         }

    public static void bubbleSort(Book[] books) {
        boolean unsorted = true;
        Book temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < books.length - 1; i++) {
                if (books[i].getIssueYear() > books[i + 1].getIssueYear()) {
                    temp = books[i];
                    books[i] = books[i + 1];
                    books[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

//   17. Вывести количество библиотек, где есть хотя бы одна электронная книга

    public static void printCountOfLibrariesWithAtLeastOneEBook(Library[] libraries) {
        int countOfLibrariesWithEBook = 0;
        for (Library library : libraries) {
            for (int j = 0; j < library.getBooks().length; j++) {
                if (library.getBooks()[j].isEBOOK()) {
                    countOfLibrariesWithEBook++;
                    break;
                }
            }
        }
        System.out.println(countOfLibrariesWithEBook + " have at least one EBook");
    }

//        18. Вывести книги, чьё название содержит определённое слово

    public static void printBooksContainingWord(Library[] libraries, String word) {
        System.out.println("Books containing " + word + " :");
        for (Library library : libraries) {
            for (int j = 0; j < library.getBooks().length; j++) {
                if (library.getBooks()[j].getName().contains(word))
                    System.out.println(library.getBooks()[j]);
            }
        }
    }
//     19. Вывести пары "Автор - Самая старая книга"
          public static void printAuthorsWithOldestBooks(Library[] libraries) {
             String[] authors = getArrayOfAuthors(libraries);
              for (String author : authors) {
                  if (!Objects.equals(author, "a")) {
                      int tempYear = Integer.MAX_VALUE;
                      for (Library library : libraries) {
                          for (int j = 0; j < library.getBooks().length; j++) {
                              if (library.getBooks()[j].getAuthor().equals(author) &&
                                      library.getBooks()[j].getIssueYear() < tempYear)
                                  tempYear = library.getBooks()[j].getIssueYear();
                          }
                      }
                      System.out.println(author + ": " + tempYear);
                  }
              }

          }

          public static String[] getArrayOfAuthors(Library[] libraries){
              String[] authors = new String[calculateAuthorsLength(libraries)];
              Arrays.fill(authors, "a");
              int index = 0;
              for (Library library : libraries) {
                  for (int j = 0; j < library.getBooks().length; j++) {
                      if (isContainInArray(library.getBooks()[j].getAuthor(), authors)) {
                          break;
                      } else {
                          authors[index] = library.getBooks()[j].getAuthor();
                          index++;
                      }
                  }
              }
              return authors;
          }

    public static boolean isContainInArray(String str, String[] strs){
        for(String s: strs) {
            if(s.equals(str)) {
                return true;
            }
        }
        return false;
    }

          public static int calculateAuthorsLength(Library[] libraries){
             int tempLength = 0;
              for (Library library : libraries) {
                  tempLength += (int) library.getBookNumbers();
              }
              return tempLength;
          }


//      20. Вывести библиотеки, в которых каждая книга - электронная
          public static void printLibrariesWithAllEBooks(Library[] libraries) {
              for (int i = 0; i < libraries.length; i++) {
                  int countOfCommonBooks = 0;
                  for (int j = 0; j < libraries[i].getBooks().length; j++) {
                      if (!libraries[i].getBooks()[j].isEBOOK()) {
                          countOfCommonBooks++;
                          break;
                      }
                  }
                  if (countOfCommonBooks == 0){
                      System.out.println("Library " + i + " has only eBooks");
                  }
              }
          }
}