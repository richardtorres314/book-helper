import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BookCatalog {
    PriorityQueue<Book> bookQueue = new PriorityQueue<Book>();

    public Book[] filter(String type, String searchTerm) {
        PriorityQueue<Book> filteredBooks = new PriorityQueue<Book>();

        for (Book book : bookQueue) {
            if (book == null)
                continue;

            String key = "";
            switch (type) {
                case "issuingDate":
                    key = book.getIssued();
                    break;
                case "title":
                    key = book.getTitle();
                    break;
                case "language":
                    key = book.getLanguage();
                    break;
                case "author":
                    key = book.getAuthors();
                    break;
                case "genre":
                    key = book.getType();
                    break;
                case "bookshelf":
                    key = book.getBookshelves();
                    break;
            }

            System.out.println(key);
            System.out.println(searchTerm);
            if (key.contains(searchTerm)) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks.toArray(Book[]::new);
    }

    public BookCatalog() {
        try {
            File file = new File("test.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] dataSplit = line.split(",");
                Book book = new Book(dataSplit[0], dataSplit[1], dataSplit[2], dataSplit[3], dataSplit[4], dataSplit[5],
                        dataSplit[6], dataSplit[7], dataSplit[8]);
                bookQueue.add(book);
                line = bufferedReader.readLine();
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public PriorityQueue<Book> getBooks() {
        return bookQueue;
    }
}
