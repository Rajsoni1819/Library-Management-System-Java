import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Library Object
        Library library = new Library();

        int choice;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title : ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    String author = sc.nextLine();

                    Book b = new Book(id, title, author);

                    library.addBook(b);

                    break;

                case 2:

                    library.viewBooks();

                    break;

                case 3:

                    System.out.print("Enter Book ID : ");
                    id = sc.nextInt();

                    Book book = library.searchBook(id);

                    if (book != null)
                        book.display();
                    else
                        System.out.println("Book Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Book ID : ");
                    id = sc.nextInt();

                    library.issueBook(id);

                    break;

                case 5:

                    System.out.print("Enter Book ID : ");
                    id = sc.nextInt();

                    library.returnBook(id);

                    break;

                case 6:

                    System.out.print("Enter Book ID : ");
                    id = sc.nextInt();

                    library.removeBook(id);

                    break;

                case 7:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 7);

        sc.close();

    }
}