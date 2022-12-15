package FileSystem;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.*;  // Import user input

public class Writer {
    
    static void write() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to write to.");
        String file = sc.nextLine();
        sc.nextLine();
        try {
            FileWriter myWriter = new FileWriter(file + ".txt");
            boolean done = false;
            String newtext = "";
            while (done == false) {
                System.out.println("Enter the text you want to write.");
                newtext = sc.nextLine();
                sc.nextLine();
                if (newtext != "") {
                    myWriter.append(newtext);
                    myWriter.append('\n');
                    System.out.println("Successfully wrote to the file.");
                    System.out.println("Are you done writing?  Enter 'true' or 'false'.");
                    done = sc.nextBoolean();
                }
                newtext = "";
            }
            myWriter.close();
            System.out.println("File closed.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        sc.close();
    }
    public static void main(String[] args) {
        write();
    }
}