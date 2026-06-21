public class Book {
    int id;
    String author;
    String title;
    boolean available;
    Book(int id,String title,String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;

    }
     void display() {
        System.out.println("Book ID : " + id);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);

        if (available)
            System.out.println("Status  : Available");
        else
            System.out.println("Status  : Issued");

        System.out.println("-------------------------");
    }
}
    

