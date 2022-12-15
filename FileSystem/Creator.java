package FileSystem;

import java.io.File;  // Import File
import java.io.IOException;  // Import IOException
import java.util.*;  // Import user input

public class Creator {

    static void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to create.");
        String file = sc.nextLine();
        sc.nextLine();
        try {
            File myObj = new File(file + ".txt");
            if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
            } else {
            System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        sc.close();
    }
    public static void main(String[] args) {
        create();
    }
}
