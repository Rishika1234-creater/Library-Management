# Project Statement – Library Management System

## 1. Problem Statement
In many small libraries and student communities, books are still managed manually.  
Maintaining records becomes difficult when there is no proper system to keep track of  
available books, issued books, and returned books.  
To solve this problem, I designed a simple console-based Library Management System  
that helps manage the basic operations of a library easily.

## 2. Scope of the Project
The project focuses on the following operations:

- Adding new books to the library.  
- Displaying all available books.  
- Issuing a book to a user.  
- Returning an issued book.  
- Maintaining the quantity of each book.  

The scope is limited to basic inventory management and does not include advanced features  
like user login, fine calculation, or database storage.

## 3. Target Users
This system is mainly useful for:

- Students.  
- Small libraries.  
- Teachers who manage books in classrooms.  
- Beginners learning Java and OOP concepts.
  
## **4. High-Level Features**  

###  **a. Add Book**  
Allows the user to add a new book with its details. The book is stored in an ArrayList.

###  **b. View Books**  
Displays all the books in the library along with ID, name, author, and available quantity.

###  **c. Issue Book**  
Issues a book by checking availability and reducing its quantity. Shows proper messages like “Book issued” or “Book not available”.

###  **d. Return Book**  
Returns a previously issued book and increases its quantity.

## **5. Functional Requirements**  
- The system must allow adding at least one book.  
- The user must be able to view the list of books.  
- The system must allow issuing and returning books.  
- There must be a proper menu-driven workflow.
  
  ## **6. Non-Functional Requirements**  
- **Usability:** Easy menu and simple input-output.  
- **Performance:** Fast execution using ArrayList.  
- **Error Handling:** Shows clear messages for invalid choices or unavailable books.  
- **Maintainability:** Code is divided into separate classes and is easy to update.
## **7. Workflow (Simple Explanation)**  
1. User opens the program.  
2. Menu appears.  
3. User selects an option.  
4. System performs that operation.  
5. Menu appears again.  
6. User can exit anytime.

## **8. System Modules**  
- **Book.java:** Represents the structure of a book.  
- **Library.java:** Handles add, view, issue, return operations.  
- **Utils.java:** Helps take input cleanly.  
- **Main.java:** Runs the menu-based system.

## **9. Tools & Technologies Used**  
- Java  
- OOP Concepts  
- ArrayList  
- Scanner (for input)

  
This document explains the core idea, features, and scope of the project in a simple and understandable way.
