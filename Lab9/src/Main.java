import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
        //Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: " +"\n");
        String filename = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new File(filename))) {
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        //Task 2
        String filename2 = "Labwork9.txt";
    }
}