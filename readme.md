# Library Management System

This is a simple Java project where I created a basic Library Management System.  
It is made as a part of the VITYARTHI project.  
The aim of this project was to apply the concepts learned in class and build something real.

## Project Overview
The Library Management System allows users to add books, view all books, issue a book, and return a book.  
It is a menu-driven console program and works using basic Java concepts like classes, objects, ArrayList, and functions.

## Features (Functional Requirements)

1. **Add Book**  
   - User can add a new book by entering ID, name, author, and quantity.

2. **View Books**  
   - Shows all the books stored in the library.

3. **Issue Book**  
   - Decreases the quantity if the book is available.

4. **Return Book**  
   - Increases the quantity when the book is returned.

These four features form the main workflow of the system.

## Non-Functional Requirements

- **Usability:** The menu is simple and easy to understand.  
- **Performance:** All operations work instantly since the program runs in memory.  
- **Maintainability:** Code is written in multiple classes to keep it clean and organized.  
- **Error Handling:** Shows messages for invalid IDs, unavailable books, etc.

## Technologies Used

- Java  
- OOP (Classes & Objects)  
- ArrayList  
- Scanner for input  

## Folder Structure
src/
├── Main.java // main menu and program flow
├── Book.java // book details
├── Library.java // main logic for add/view/issue/return
└── Utils.java // input handling

## How to Run the Project

1. Open the folder in VS Code.  
2. Make sure Java extensions are installed.  
3. Open **Main.java**  
4. Click on **Run**  
5. Use the menu numbers to test the features.

## Sample Output

===== LIBRARY MANAGEMENT SYSTEM =====

1.Add Book

2.View Books

3.Issue Book

4.Return Book

5.Exit

## Testing Instructions

- Try adding 2–3 books.  
- View the list to check if books were added.  
- Issue a book and check if quantity decreases.  
- Return a book and check if quantity increases.  
- Try entering a wrong ID to test error messages.

## Future Enhancements

- Saving data permanently using files or database  
- Adding user login system  
- Searching books by name or author  
- GUI (Graphical Interface)

##  Author

**Rishika Sinha**  
Built with simple logic, clean code, and lots of learning.


