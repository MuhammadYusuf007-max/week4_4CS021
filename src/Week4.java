import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Week4 {

    public static void main(String[] args) {
        String csvFile = "example.csv";
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(csvFile));

            writer.append("Hiran");
            writer.append(",");
            writer.append("Patel");
            writer.append("\n");

            writer.append("Lionel");
            writer.append(",");
            writer.append("Messi");
            writer.append("\n");

            writer.append("Ruben");
            writer.append(",");
            writer.append("Neves");
            writer.append("\n");

            writer.flush();
            writer.close();

            System.out.println("CSV file updated successfully!");
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e);
        }
    }
}
