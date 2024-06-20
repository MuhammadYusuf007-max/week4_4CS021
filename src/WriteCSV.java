import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {

    public static void main(String[] args) {
        String csvFile = "example.csv";
        BufferedWriter writer = null;

        try {
            // Create a FileWriter in append mode
            writer = new BufferedWriter(new FileWriter(csvFile, true));
            writer.append("Adama");
            writer.append(",");
            writer.append("Traore");
            writer.append("\n");

            writer.append("Pedro");
            writer.append(",");
            writer.append("Neto");
            writer.append("\n");

            writer.flush();
            writer.close();

            System.out.println("CSV file updated successfully!");
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e);
        }
    }
}

