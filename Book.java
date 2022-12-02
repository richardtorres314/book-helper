public class Book implements Comparable<Book>{
    String textNumber;
    String type;
    String issued;
    String title;
    String language;
    String authors;
    String subjects;
    String loCC;
    String bookshelves;

    public Book(String textNumber, String type, String issued, String title, String language, String authors, String subjects, String loCC, String bookshelves) {
        this.textNumber = textNumber;
        this.type = type;
        this.issued = issued;
        this.title = title;
        this.language = language;
        this.authors = authors;
        this.subjects = subjects;
        this.loCC = loCC;
        this.bookshelves = bookshelves;
    }

    public String getTextNumber() {
        return textNumber;
    }
    public String getType() {
        return type;
    }
    public String getIssued() {
        return issued;
    }
    public String getTitle() {
        return title;
    }
    public String getLanguage() {
        return language;
    }
    public String getAuthors() {
        return authors;
    }
    public String getSubjects() {
        return subjects;
    }
    public String getLoCC() {
        return loCC;
    }
    public String getBookshelves() {
        return bookshelves;
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
