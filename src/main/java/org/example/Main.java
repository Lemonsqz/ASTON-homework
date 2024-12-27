package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Chernovik", "Lukianenko", 2005, true,220);
        Book book2 = new Book("Master i margarita", "Bulgakov", 1940, true,300);
        Book book3 = new Book("Chistovik", "Lukianenko", 2008, true,185);
        Book book4 = new Book("Tainstvenniy ostrov", "Jules Verne", 150);
        Book book5 = new Book("Необычные поиски", "Индиана Джонс", 250);
        Book book6 = new Book("Программируем на Java", "Марк Лой", 340);
        Book book7 = new Book("Разработка Android-приложений с нуля", "Джон Хортон", 2015, true,190);
        Book book8 = new Book("Программирование на Java для начинающих", "Алексей Васильев", 2010,true, 310);
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

        List<Student>students=List.of(student1,student2,student3);


        students.stream()
                .peek(student -> System.out.println(student.getName()+"\n")) // Вывод всех студентов в консоль 3.1
                .flatMap(student -> student.getStudentBooks().stream()) // Получаем список книг для каждого студента 3.2
                .toList() // Получаем список всех книг 3.3
                .stream()
                .sorted(Comparator.comparingInt(Book::getPages)) // Сортировка по количеству страниц 3.4
                .distinct() // Оставляем только уникальные книги 3.5
                .filter(book -> book.getYear() > 2000) // Фильтр книг от 2000 года 3.6
                .limit(3) // Ограничение в 3 элемента 3.7
                .map(Book::getYear) // получаем из книг годы выпуска 3.8
                .findFirst() // Возвращаем первый результат или Optional 3.9
                .ifPresentOrElse( // Вывод в консоль год выпуска найденной книги или ее отсутствии
                        year -> System.out.println("\nГод выпуска книги: " + year),
                        () -> System.out.println("Книга отсутствует")
                );






    }
}