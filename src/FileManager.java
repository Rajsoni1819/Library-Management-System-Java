import java.io.*;

public class FileManager {

    // Save Books to File
    void saveBooks(Book[] books, int count) {

        try {

            FileWriter fw = new FileWriter("books.txt");

            for (int i = 0; i < count; i++) {

                fw.write(books[i].id + ",");
                fw.write(books[i].title + ",");
                fw.write(books[i].author + ",");
                fw.write(books[i].available + "\n");

            }

            fw.close();

            System.out.println("Books Saved Successfully.");

        } catch (Exception e) {

            System.out.println("Error Saving File.");

        }

    }

    // Load Books From File
    int loadBooks(Book[] books) {

        int count = 0;

        try {

            File file = new File("books.txt");

            if (!file.exists())
                return 0;

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                books[count] = new Book(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2]);

                books[count].available = Boolean.parseBoolean(data[3]);

                count++;
            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error Loading File.");

        }

        return count;

    }
}