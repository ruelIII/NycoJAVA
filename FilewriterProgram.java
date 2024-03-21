import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FilewriterProgram {

    public static void main(String[] args) {

        File textFile = new File("main.txt");

        try {
            FileWriter nyco = new FileWriter(textFile);
            nyco.write("JOpeTA");
            nyco.close();
            System.out.println("Printed successfully");

        } catch (Exception e) {
            System.out.println("nag error");
            e.printStackTrace();
        }

    }
}
