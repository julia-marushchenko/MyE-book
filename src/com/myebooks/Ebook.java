package com.myebooks;

import java.util.ArrayList;
import java.util.Objects;

public class Ebook implements Readable{

    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public Ebook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
    }

    // Getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPages() {
        return pages;
    }

    public void setPages(ArrayList<String> pages) {
        this.pages = pages;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    //Equals and hashCode.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ebook ebook = (Ebook) o;
        return pageNumber == ebook.pageNumber && Objects.equals(name, ebook.name) && Objects.equals(pages, ebook.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, pageNumber);
    }

    // ToString.
    @Override
    public String toString() {
        return "Ebook{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", pageNumber=" + pageNumber +
                '}';
    }

    public int pages() {
        return this.pages.size();
    }

    @Override
    public String read() {
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }

    private void nextPage() {
        this.pageNumber = this.pageNumber + 1;
        if(this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }
}
