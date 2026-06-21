// Class to perform all library operations

public class Library {

    // Array to store books
    Book[] books = new Book[100];

    // Number of books currently stored
    int count = 0;

    // Add Book
    void addBook(Book b) {

        books[count] = b;
        count++;

        System.out.println("Book Added Successfully.");
    }

    // View All Books
    void viewBooks() {

        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }

    // Search Book
    Book searchBook(int id) {

        for (int i = 0; i < count; i++) {

            if (books[i].id == id) {
                return books[i];
            }
        }

        return null;
    }

    // Issue Book
    void issueBook(int id) {

        Book b = searchBook(id);

        if (b == null) {
            System.out.println("Book Not Found.");
        }
        else if (!b.available) {
            System.out.println("Book Already Issued.");
        }
        else {
            b.available = false;
            System.out.println("Book Issued Successfully.");
        }
    }

    // Return Book
    void returnBook(int id) {

        Book b = searchBook(id);

        if (b == null) {
            System.out.println("Book Not Found.");
        }
        else if (b.available) {
            System.out.println("Book is Already Available.");
        }
        else {
            b.available = true;
            System.out.println("Book Returned Successfully.");
        }
    }

    // Remove Book
    void removeBook(int id) {

        int index = -1;

        // Find the book index
        for (int i = 0; i < count; i++) {
            if (books[i].id == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Book Not Found.");
            return;
        }

        // Shift remaining books to the left
        for (int i = index; i < count - 1; i++) {
            books[i] = books[i + 1];
        }

        books[count - 1] = null;
        count--;

        System.out.println("Book Removed Successfully.");
    }
}