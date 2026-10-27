/**
 *  Java program to create E-Book.
 */

package com.myebooks;

import java.util.ArrayList;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating pages.
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short readble entities.");
        pages.add("Separate user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the program.");
        pages.add("Practice makes the master. Work on your own projects.");

        // Creating a book.
        Ebook ebook = new Ebook("Tipps for programming.", pages);

        // Printing a book.
        int page = 0;
        while (page < ebook.pages()) {
            System.out.println(ebook.read());
            page = page + 1;
        }

    }
}