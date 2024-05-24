public class Main {


    public static void main(String[] args) {

        Author author1 = new Author("John", "Jonson");
        System.out.print("Автор : " + author1.getName() + " ");
        System.out.println(author1.getFullName());

        Book book = new Book("Travel", author1, 2001);
        System.out.println("\nНазвание книги: " + book.getNameBook());
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Год выпуска: " + book.getYearIssue());
        book.setYearIssue(2005);
        System.out.println("Год перевыпуска: " + book.getYearIssue());

        Author author2 = new Author("Merry", "Lansher");
        System.out.print("\nАвтор : " + author2.getName() + " ");
        System.out.println(author2.getFullName());

        Book book2 = new Book("Money", author2, 1997);
        System.out.println("\nНазвание книги: " + book2.getNameBook());
        System.out.println("Автор: " + book2.getAuthor());
        System.out.println("Год выпуска: " + book2.getYearIssue());
    }
}