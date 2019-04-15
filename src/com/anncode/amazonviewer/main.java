package com.anncode.amazonviewer;

import com.anncode.amazonviewer.model.Movie;

import java.util.Date;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Movie movie = new Movie("Coco", "Animation", "Unamed", 120, 2017);

        System.out.println(movie);
    }

    public static void showMenu() {

        int exit = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Bienvenidos");
            System.out.println("Selecciona una opción");
            System.out.println("Opcioón 1. Movies");
            System.out.println("Opcioón 2. Series");
            System.out.println("Opcioón 3. Books");
            System.out.println("Opcioón 4. Magazines");
            System.out.println("Opcioón 5. Report");
            System.out.println("Opcioón 6. Report Today");
            System.out.println("Opcioón 0 para salir");
            System.out.print(">");

            byte Request = scanner.nextByte();
            switch (Request) {
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;
                case 0:
                    exit = 0;
                    break;
                default:
                    System.out.println("Selecciona una opción del menú");
                    exit = 1;
            }
            System.out.println("");

        } while (exit != 0);

    }

    public static void showMovies() {

        System.out.println();
        System.out.println(":: Movies");
        System.out.println();

    }

    public static void showSeries() {

        System.out.println();
        System.out.println(":: Series");
        System.out.println();

    }

    public static void showBooks() {

        System.out.println();
        System.out.println(":: Books");
        System.out.println();

    }

    public static void showMagazines() {

        System.out.println();
        System.out.println(":: Magaziness");
        System.out.println();

    }

    public static void showChapters() {

    }

    public static void makeReport() {

    }

    public static void makeReport(Date date) {

    }

}
