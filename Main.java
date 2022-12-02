import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        Book[] results;
        String s = "";
        while (!(s.equals("y") || s.equals("n"))) {
            s = IBIO.input("Hello I am Your librarian, Stefano. Would you like to find a book (y or n)\n");
        }
        if (s.equals("y")) {
            while (!(s.equals("issuing date") || s.equals("title") || s.equals("language") || s.equals("author")
                    || s.equals("genre") || s.equals("bookshelf"))) {
                s = IBIO.input(
                        "What kind of filter would you like (issuing date, title, language, author, subject, bookshelf)\n");
            }
            if (s.equals("issuing date")) {
                s = IBIO.input("what is the publishing date of your book?\n");
                results = bookCatalog.filter("issyuingDate", s);
            } else if (s.equals("title")) {
                s = IBIO.input("what is the title of your book?\n");
                results = bookCatalog.filter("title", s);
            } else if (s.equals("language")) {
                s = IBIO.input("in what language is your book?\n");
                results = bookCatalog.filter("language", s);
            } else if (s.equals("author")) {
                s = IBIO.input("who is the author of the book?\n");
                results = bookCatalog.filter("author", s);
            } else if (s.equals("genre")) {
                s = IBIO.input("what kind of genre would you like\n");
                results = bookCatalog.filter("genre", s);
            } else {
                s = IBIO.input("what bookshelf would you find the book on\n");
                results = bookCatalog.filter("bookshelf", s);
            }

            for (Book book : results) {
                String bookString = book.getTitle() + ", " + book.getAuthors() + ", " + book.getIssued() + ", "
                        + book.getBookshelves() + ", " + book.getLanguage() + ", " + book.getLoCC() + ", "
                        + book.getSubjects() + ", " + book.getType();
                IBIO.output(bookString);
            }

        } else {
            IBIO.output("Ok, thank you for coming. Please Re run to search");
        }
    }
}
// Librarian says hello and ask if you would like to search for books
/// user responds valid yes
// Librarian asks for filter
/// user respond with a valid filter
// Librarian ask for a value to apply to the filter
/// user gives valid value
// Librarian searches for value of filter in books
// Librarian gives results that coresponds to the filter
/// user consumes results
