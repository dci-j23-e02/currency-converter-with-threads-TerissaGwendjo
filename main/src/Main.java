import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter the source currency (e.g., USD): ");
        String fromCurrency = scanner.nextLine();
        System.out.print("Enter the target currency (e.g., EUR): ");
        String toCurrency = scanner.nextLine();

        // Create and start the conversion thread (user thread)
        Thread conversionThread = new UserThread(amount, fromCurrency, toCurrency);
        conversionThread.start();

        // Create and start the background daemon thread
        Thread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // Set as daemon thread
        daemonThread.start();

        // Wait for the conversion thread to complete
        try {
            conversionThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the scanner
        scanner.close();
    }

}
