import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class QuadraticRoots {
    public static void main(String[] args) {
        String inputFilePath = "QuadraticsData.csv";
        String outputFilePath = "roots.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             PrintWriter pw = new PrintWriter(new FileWriter(outputFilePath))) {

            // Write the header to the output file
            pw.println("a,b,c,Roots");

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                double a = Double.parseDouble(values[0]);
                double b = Double.parseDouble(values[1]);
                double c = Double.parseDouble(values[2]);

                String roots = calculateAndFormatRoots(a, b, c);
                pw.println(a + "," + b + "," + c + "," + roots);
            }

            System.out.println("Roots have been written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String calculateAndFormatRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Two roots: " + root1 + ", " + root2;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return "One root: " + root;
        } else {
            return "No real roots";
        }
    }
}
