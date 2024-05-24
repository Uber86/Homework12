public class Book {

    private String nameBook;
    private Author author;
    private int yearIssue;

    public Book (String bookName, Author authorName, int yearIssue) {
        this.nameBook = bookName;
        this.author = authorName;
        this.yearIssue = yearIssue;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getYearIssue() {
        return this.yearIssue;
    }
    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }
}
