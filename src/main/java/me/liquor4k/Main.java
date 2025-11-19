package me.liquor4k;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println("Информация о книгах до изменения:");
        printBookInfo(book1);
        printBookInfo(book2);

        book1.setPublicationYear(1870);

        System.out.println("\nИнформация о книгах после изменения:");
        printBookInfo(book1);
        printBookInfo(book2);
    }

    private static void printBookInfo(Book book) {
        System.out.println("Книга: '" + book.getTitle() + "'");
        System.out.println("Автор: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println("Год публикации: " + book.getPublicationYear());
        System.out.println("---");
    }
}