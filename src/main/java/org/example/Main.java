package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Chernovik", "Lukianenko", 2005, true,220);
        Book book2 = new Book("Master i margarita", "Bulgakov", 1940, true,300);
        Book book3 = new Book("Chistovik", "Lukianenko", 2008, true,250);
        Book book4 = new Book("Tainstvenniy ostrov", "Jules Verne");
        Book book5 = new Book("Необчные поиски", "Индиана Джонс", 1950, true,250);
        Book book6 = new Book("Программируем на Java", "Марк Лой", 340);
        Book book7 = new Book("Разработка Android-приложений с нуля", "Джон Хортон", 190);
        Book book8 = new Book("Программирование на Java для начинающих", "Алексей Васильев",  310);
        Book book9 = new Book("Spring Boot 2: лучшие практики для профессионалов", "Фелипе Гутьеррес",  260);
        Book book10 = new Book("Основы программирования с Java", "Тимур Машнин", 130);

        Student student1 = new Student("Иванов",20, List.of(book7,book2,book3,book10,book6));
        Student student2 = new Student("Смирнов",19, List.of(book5,book2,book4,book7,book9));
        Student student3 = new Student("Петров",22, List.of(book1,book8,book9,book5,book10));

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

//        System.out.println("\nДоступные книги: ");
//        library.printAvailableBooks();
//
//        System.out.println("\nПоиск книг по автору: ");
//        library.findBooksByAuthor("Lukianenko");
//
//
//        System.out.println("\nВывод доступных книг,после изменения статуса одной из них:");
//        book4.returnBook();
//        library.printAvailableBooks();
//
//        book1.displayInfo();
        List<Student>students=List.of(student1,student2,student3);


        students.stream()
                .flatMap(student -> student.getStudentBooks().stream()) // Извлечение книг
                .sorted(Comparator.comparingInt(Book::getPages)) // Сортировка по количеству страниц
                .distinct() // Уникальные книги
                .filter(book -> book.getYear() > 1800) // После 1800 года
                .limit(3) // Ограничение в 3 элемента
                .map(Book::getYear) // Годы выпуска
                .findFirst() // Возвращаем первый результат или Optional
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска книги: " + year),
                        () -> System.out.println("Книга отсутствует")
                );






    }
}