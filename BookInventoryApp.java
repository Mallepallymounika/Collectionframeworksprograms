/*write a java program for BookInventory
    Add Book
       Search book by Author
       Sell Book
       Enter an option*/

import java.util.*;
class Book {
    private String title;
    private String author;
    private int quantity;

    public Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
class BookInventory {
    private Map<String, List<Book>> booksByAuthor;
    public BookInventory() {
        booksByAuthor = new HashMap<>();
    }

    public void addBook(String title, String author, int quantity) {
        Book book = new Book(title, author, quantity);
        booksByAuthor.putIfAbsent(author, new ArrayList<>());
        booksByAuthor.get(author).add(book);
    }

    public List<Book> searchByAuthor(String author) {
        return booksByAuthor.getOrDefault(author, new ArrayList<>());
    }

    public boolean sellBook(String title, String author) {
        List<Book> books = booksByAuthor.get(author);
        if (books != null) {
            for (Book book : books) {
                if (book.getTitle().equals(title) && book.getQuantity() > 0) {
                    book.setQuantity(book.getQuantity() - 1);
                    return true;
                }
            }
        }
        return false;
    }
}

public class BookInventoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookInventory inventory = new BookInventory();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book by Author");
            System.out.println("3. Sell Book");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addBook(title, author, quantity);
                    break;

                case 2:
                    System.out.print("Enter author to search: ");
                    String searchAuthor = scanner.nextLine();
                    List<Book> foundBooks = inventory.searchByAuthor(searchAuthor);
                    if (foundBooks.isEmpty()) {
                        System.out.println("No books found for the author.");
                    } else {
                        System.out.println("Books by " + searchAuthor + ":");
                        for (Book book : foundBooks) {
                            System.out.println("- " + book.getTitle() + " (" + book.getQuantity() + " left)");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter book title to sell: ");
                    String sellTitle = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String sellAuthor = scanner.nextLine();
                    if (inventory.sellBook(sellTitle, sellAuthor)) {
                        System.out.println("Book sold successfully.");
                    } else {
                        System.out.println("Book not available or not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }

            System.out.println();
        }
    }
}
