import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimeNumbersToCSV {
    public static void main(String[] args) {
        String outputFilePath = "PrimeNumbers.csv";

        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFilePath))) {
            pw.println("Prime Numbers");

            for (int i = 3; i <= 1000; i++) {
                if (isPrime(i)) {
                    pw.println(i);
                }
            }

            System.out.println("Prime numbers have been written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


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
