public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int id = Utils.getIntInput("Enter Book ID: ");
                    String name = Utils.getStringInput("Enter Book Name: ");
                    String author = Utils.getStringInput("Enter Author Name: ");
                    int qty = Utils.getIntInput("Enter Quantity: ");
                    library.addBook(new Book(id, name, author, qty));
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    int issueId = Utils.getIntInput("Enter Book ID to Issue: ");
                    library.issueBook(issueId);
                    break;

                case 4:
                    int returnId = Utils.getIntInput("Enter Book ID to Return: ");
                    library.returnBook(returnId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

