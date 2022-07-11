package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We take a book from UniLibrary");
        System.out.println("____________________________");
    }

    public void getMagazine() {
        System.out.println("We take a Magazine from UniLibrary ");
        System.out.println("____________________________");
    }

    public void returnBook() {
        System.out.println("We return the book UniLibrary");
        System.out.println("____________________________");
    }

    public void returnMagazine() {
        System.out.println("We return the Magazine into UniLibrary");
        System.out.println("____________________________");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Add book to thr UniLibrary");
        System.out.println("____________________________");
    }

    public void addMagazine() {
        System.out.println("Add Magazine to thr UniLibrary");
        System.out.println("____________________________");
    }


}
