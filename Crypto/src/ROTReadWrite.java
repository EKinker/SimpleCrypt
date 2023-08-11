import java.io.*;
import java.util.Scanner;

public class ROTReadWrite {

    public static void main(String[] args) {
        ROT13 cipher = new ROT13('a','n');

        try {
            File input = new File("sonnet18.txt");
            File writer = new File("sonnet18.enc");
            Scanner scanner = new Scanner(input);
            PrintWriter printWriter = new PrintWriter(writer);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                printWriter.write(cipher.encrypt(line)+"\n");  //is there a  better way to do new lines?

            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
