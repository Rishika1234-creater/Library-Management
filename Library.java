import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("\n--- BOOK LIST ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (b.getQuantity() > 0) {
                    b.issueBook();
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book not available!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                b.returnBook();
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
}

