package com.anncode.amazonviewer;

import com.anncode.amazonviewer.model.Movie;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.lang.reflect.*;

public class main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

//        Movie movie = new Movie("Coco", "Animation", "Unamed", 120, 2017);
//
//        System.out.println(movie);

        showMenu();

    }

    public static void showMenu() throws Exception {

        int exit = 0;

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

    public static void showSubMenu(String func) throws Exception {

        System.out.println("Recargar: 1");
        System.out.println("Regresar a Menú: 0");

        System.out.print(">");
        main m = new main();

        int opc = scanner.nextInt();
        switch (opc) {
            case 0:
                showMenu();
                break;
            case 1:
                m.callByName(func);
                break;
            default:
                System.out.println("Elija una opción del menú");
                showSubMenu(func);
                break;
        }

    }

    public static void showMovies() throws Exception {

        System.out.println();
        System.out.println(":: Movies");
        System.out.println();
        ArrayList<Movie> movies = Movie.makeMovieList();

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + 1 + ". " + movies.get(i).getTitle() + ", Visto: " + movies.get(i).isViewed());
        }

        showSubMenu("showMovies");

    }

    public void callByName(String funcName) {
        try {
            Method method = getClass().getDeclaredMethod(funcName);
            method.invoke(this, new Object[]{});
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
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
