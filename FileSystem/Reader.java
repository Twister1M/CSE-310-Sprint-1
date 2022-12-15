package FileSystem;

import java.util.Scanner; // Import the Scanner class to read text files


public class Reader {

    static void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to read from.");
        String file = sc.nextLine();
        sc.nextLine();
        Scanner reader = new Scanner(file + ".txt");
        if (reader.hasNextLine()) {
            System.out.println("File found.");
        }
        while (reader.hasNextLine()) {

            String line = reader.nextLine();

            System.out.println(line);

        }

        reader.close();
        sc.close();
    }
    public static void main(String[] args) {
        read();
    }
}
