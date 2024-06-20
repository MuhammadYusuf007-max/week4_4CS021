import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimeNumbersFromCSV {
    public static void main(String[] args) {
        String inputFilePath = "RandomNumbers.csv";
        String outputFilePath = "primenumbers.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             PrintWriter pw = new PrintWriter(new FileWriter(outputFilePath))) {

            String line;

            // Write header to the output file
            pw.println("Prime Numbers");

            // Read input file line by line
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    try {
                        int number = Integer.parseInt(value.trim());
                        if (isPrime(number)) {
                            pw.println(number);
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Skipping invalid number: " + value);
                    }
                }
            }

            System.out.println("Prime numbers have been written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
