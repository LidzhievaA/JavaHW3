//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка 
//содержится название жанра, а на остальных позициях - названия книг. 
//Напишите метод для заполнения данной структуры(можно через консоль).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        // ArrayList<String> genres = new ArrayList<>();
        // ArrayList<String> books = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество книг: ");
        int booksCount = sc.nextInt();

        System.out.println("Введите количество жанров: ");
        int genreCount = sc.nextInt();

        for (int i = 0; i < genreCount; i++) {
            ArrayList<String> genres = new ArrayList<>();
            Scanner scNames = new Scanner(System.in);
            System.out.println("Введите название жанра: ");
            String genreName = scNames.nextLine();
            genres.add(0, genreName);
            catalog.add(genres);
            for (int j = 0; j < booksCount; j++) {
                ArrayList<String> books = new ArrayList<>();
                System.out.println("Введите название книги: ");
                String bookName = scNames.nextLine();
                books.add(bookName);
                catalog.add(books);
            }

        //}

        for (ArrayList<String> elem : catalog) {
            System.out.print(elem + " ");
            }
        }
    }
}