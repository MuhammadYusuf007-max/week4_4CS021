import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCSV {

    public static void main(String[] args) {
        String csvFile = "MyFirstFile.csv";
        BufferedWriter writer = null;

        try {
            // Create a FileWriter in append mode
            writer = new BufferedWriter(new FileWriter(csvFile));
            writer.append("Muhammad ");
            writer.append(" ");
            writer.append("Yusuf");
            writer.append("\n");

            writer.append("ID:2427312");
            writer.append(",");
            writer.append("age:20");
            writer.append("\n");

            writer.flush();
            writer.close();

            System.out.println("CSV file writed successfully!");
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e);
        }
}
}