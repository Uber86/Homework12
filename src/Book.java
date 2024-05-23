public class Book {

    private String nameBook;
    private String author;
    int yearIssue;

    public Book (String bookName, String authorName, int yearIssue) {
        this.nameBook = bookName;
        this.author = authorName;
        this.yearIssue = yearIssue;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAutor() {
        return this.author;
    }
    public int getYearIssue() {
        return this.yearIssue;
    }
    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }
}
