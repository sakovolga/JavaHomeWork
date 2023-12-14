package de.telran.HomeTask081223.Libraries_List;
//import de.telran.HomeTask081223.Libraries_Array.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Handler {
//    1. Вывести все адреса библиотек
    public static void printAllAddresses(List<Library> libraries) {
        for (Library library : libraries) {
            System.out.println(library.getAddress());
        }
    }

//     2. Подсчитать общее количество книг во всех библиотеках
     public static void printTotalBookCount(List<Library> libraries) {
         int bookCount = 0;
         for (Library library : libraries) {
             int count = library.getBooks().size();
             bookCount = bookCount + count;
         }
         System.out.println("ALL BOOKS NUMBER IS: " + bookCount);
     }

//     3. Вывести названия всех книг в библиотеке
      public static void printAllBookNames(Library library) {
          for (int i = 0; i < library.getBooks().size(); i++) {
              System.out.println(library.getBooks().get(i).getName());
          }
      }

//    4. Найти библиотеки, где есть электронные книги
    public static void printLibrariesWithEBooks(List<Library> libraries){
        for (int i = 0; i < libraries.size(); i++) {
            for (int j = 0; j < libraries.get(i).getBooks().size(); j++) {
                if (libraries.get(i).getBooks().get(j).isEBOOK()) {
                    System.out.println("Library " + i + " has EBooks");
                    break;
                }
            }
        }
    }
//    5. Вывести книги в заданном состоянии
    public static void printBooksByCondition(List<Library> libraries, Condition condition) {
        for (Library library : libraries) {
            for (int j = 0; j < library.getBooks().size(); j++) {
                if (library.getBooks().get(j).getCondition() == condition) {
                    System.out.println(library.getBooks().get(j));
                }
            }
        }
    }

//        6. Вывести список библиотек с количеством книг больше заданного
        public static void printLibrariesWithMoreThanXBooks(List<Library> libraries, long count) {
            for (Library library : libraries)
                if (count < library.getBooks().size()) {
                    System.out.println("Library with address " + library.getAddress() + " has more than " + count + " books");
                }
        }

//        7. Вывести книги, изданные до заданного года
        public static void printBooksIssuedBeforeYear(List<Library>libraries, int year) {
            for (Library library : libraries) {
                for (int j = 0; j < library.getBooks().size(); j++) {
                    if (library.getBooks().get(j).getIssueYear() > year) {
                        System.out.println(library.getBooks().get(j));
                    }
                }
            }
        }

//       8. Вывести авторов книг в алфавитном порядке
    public static void printAuthorsAlphabetically(List<Library> libraries){
        List<Book> books = combineLibraries(libraries);
        boolean unsorted = true;
        Book temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < books.size() - 1; i++) {
                if (books.get(i + 1).getAuthor().toLowerCase().compareTo(books.get(i).getAuthor().toLowerCase()) < 0) {
                    temp = books.get(i);
                    books.set(i, books.get(i + 1));
                    books.set((i + 1), temp);
                    unsorted = true;
                }
            }
        }
        for (Book book: books) {
            System.out.println(book.getAuthor());
        }
    }

    public static List<Book> combineLibraries(List<Library> libraries) {
        List<Book> combinedBooks = new ArrayList<>(10000);
        for (Library library : libraries) {
            combinedBooks.addAll(library.getBooks());
        }
        return combinedBooks;
    }

//     9. Вывести библиотеки, которые не имеют книг
    public static void printLibrariesWithoutBooks(List<Library> libraries) {
        for (Library library : libraries)
            if (library.getBooks().size() == 0) {
                System.out.println("Library with address " + library.getAddress() + " don't has books");
            }
    }

//         10. Вывести книги, названия которых начинаются на заданную букву
          public static void printBooksStartingWithLetter(List<Library> libraries, char letter) {
              System.out.println("Books starting With " + letter + " :");
              for (Library library : libraries) {
                  for (int j = 0; j < library.getBooks().size(); j++) {
                      if (library.getBooks().get(j).getName().startsWith(String.valueOf(letter)))
                          System.out.println(library.getBooks().get(j));
                  }
              }
          }


//         11. Вывести библиотеки по убыванию количества книг
    public static void printLibrariesByDescendingBookCount(List<Library> libraries) {
        boolean unsorted = true;
        Library temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < libraries.size() - 1; i++) {
                if (libraries.get(i).getBooks().size() < libraries.get(i + 1).getBooks().size()) {
                    temp = libraries.get(i);
                    libraries.set(i, libraries.get(i + 1));
                    libraries.set(i + 1, temp);
                    unsorted = true;
                }
            }
        }
        for (int i = 0; i < libraries.size(); i++) {
            System.out.println("library " + i + " - " + libraries.get(i).getBooks().size() + " books");
        }
    }

//     12. Вывести авторов и количество их книг в каждой библиотеке
    public static void printAuthorsAndTheirBookCounts(List<Library> libraries) {
        for (int i = 0; i < libraries.size(); i++) {
            for (int j = 0; j < libraries.get(i).getBooks().size(); j++) {
                String concreteAuthor = libraries.get(i).getBooks().get(j).getAuthor();
                int countOfHisBooks = 0;
                for (int k = 0; k < libraries.get(i).getBooks().size(); k++){
                    if (libraries.get(i).getBooks().get(k).getAuthor().equals(concreteAuthor)){
                        countOfHisBooks++;
                    }
                }
                System.out.println(concreteAuthor + " - " + countOfHisBooks + " in library " + i);
            }
        }
    }

    //     13. Вывести наиболее часто встречающееся состояние книг
    public static void printMostCommonBookCondition(List<Library> libraries) {
         int countOfNew = 0;
         int countOfOld = 0;
         int countOfDamaged = 0;
        for (Library library : libraries) {
            for (int j = 0; j < library.getBooks().size(); j++) {
                if (library.getBooks().get(j).getCondition() == Condition.DAMAGED) {
                    countOfDamaged++;
                } else if (library.getBooks().get(j).getCondition() == Condition.NEW) {
                    countOfNew++;
                } else if (library.getBooks().get(j).getCondition() == Condition.OLD) {
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
    public static void printLibrariesWithoutDamagedBooks(List<Library> libraries) {
        for (int i = 0; i < libraries.size(); i++) {
            int countOfDamaged = 0;
            for (int j = 0; j < libraries.get(i).getBooks().size(); j++) {
                if (libraries.get(i).getBooks().get(j).getCondition() == Condition.DAMAGED) {
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
         public static void printUniqueIssueYears(List<Library> libraries){
             List<Integer> years = new ArrayList<>();
             for (Library library : libraries) {
                 for (int j = 0; j < library.getBooks().size(); j++) {
                     if (!isContainInArray(library.getBooks().get(j).getIssueYear(), years)) {
                         years.add(library.getBooks().get(j).getIssueYear());
                         System.out.println(library.getBooks().get(j).getIssueYear());
                     }
                 }
             }
         }

    public static boolean isContainInArray(int soughtFor, List<Integer> arr){
        for(int element: arr) {
            if(element == soughtFor) {
                return true;
            }
        }
        return false;
    }

         /** 16. Вывести книги сортированные по году издания в каждой библиотеке */
         public static void printBooksSortedByIssueYear(List<Library> libraries) {
             for (int i = 0; i < libraries.size(); i++) {
                 System.out.println("library " + i + " was sorted by issue year");
                 bubbleSort(libraries.get(i).getBooks());
                 for (Book book: libraries.get(i).getBooks()) {
                     System.out.println(book);
                 }
             }
         }

    public static void bubbleSort(List<Book> books) {
        boolean unsorted = true;
        Book temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < books.size() - 1; i++) {
                if (books.get(i).getIssueYear() > books.get(i + 1).getIssueYear()) {
                    temp = books.get(i);
                    books.set(i, books.get(i + 1));
                    books.set(i + 1, temp);
                    unsorted = true;
                }
            }
        }
    }

//   17. Вывести количество библиотек, где есть хотя бы одна электронная книга

    public static void printCountOfLibrariesWithAtLeastOneEBook(List<Library> libraries) {
        int countOfLibrariesWithEBook = 0;
        for (Library library : libraries) {
            for (int j = 0; j < library.getBooks().size(); j++) {
                if (library.getBooks().get(j).isEBOOK()) {
                    countOfLibrariesWithEBook++;
                    break;
                }
            }
        }
        System.out.println(countOfLibrariesWithEBook + " libraries have at least one EBook");
    }

//        18. Вывести книги, чьё название содержит определённое слово
    public static void printBooksContainingWord(List<Library> libraries, String word) {
        System.out.println("Books containing " + word + " :");
        for (Library library : libraries) {
            for (int j = 0; j < library.getBooks().size(); j++) {
                if (library.getBooks().get(j).getName().contains(word))
                    System.out.println(library.getBooks().get(j));
            }
        }
    }

//     19. Вывести пары "Автор - Самая старая книга"
          public static void printAuthorsWithOldestBooks(List<Library> libraries) {
             List<String> authors = getListOfAuthors(libraries);
              for (String author: authors) {
                      int tempYear = Integer.MAX_VALUE;
                      for (Library library : libraries) {
                          for (int j = 0; j < library.getBooks().size(); j++) {
                              if (library.getBooks().get(j).getAuthor().equals(author) &&
                                      library.getBooks().get(j).getIssueYear() < tempYear)
                                  tempYear = library.getBooks().get(j).getIssueYear();
                          }
                      }
                      System.out.println(author + ": " + tempYear);
              }

          }

          public static List<String> getListOfAuthors(List<Library> libraries){
              List<String> authors = new ArrayList<>();
              for (Library library : libraries) {
                  for (int j = 0; j < library.getBooks().size(); j++) {
                      if (!isContainInArray(library.getBooks().get(j).getAuthor(), authors)) {
                         authors.add(library.getBooks().get(j).getAuthor());
                      }
                  }
              }
              return authors;
          }

    public static boolean isContainInArray(String str, List<String> strs){
        for(String s: strs) {
            if(s.equals(str)) {
                return true;
            }
        }
        return false;
    }

//      20. Вывести библиотеки, в которых каждая книга - электронная
          public static void printLibrariesWithAllEBooks(List<Library> libraries) {
              for (int i = 0; i < libraries.size(); i++) {
                  int countOfCommonBooks = 0;
                  for (int j = 0; j < libraries.get(i).getBooks().size(); j++) {
                      if (!libraries.get(i).getBooks().get(j).isEBOOK()) {
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