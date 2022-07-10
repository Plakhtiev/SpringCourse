package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We take a book from UniLibrary");
    }

    public void getMagazine() {
        System.out.println("We take a Magazine from UniLibrary ");
    }

    public void returnBook() {
        System.out.println("We return the book UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("We return the Magazine into UniLibrary");
    }

    public void addBook() {
        System.out.println("Add book to thr UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Add Magazine to thr UniLibrary");
    }


}
