### Assignment: Currency Converter with Threads

#### Objective:
Create a simple currency converter application that uses threads to perform currency conversion in the background. The application should allow the user to convert an amount from one currency to another. You will practice creating and using threads, as well as distinguishing between user threads and daemon threads.

#### Requirements:
1. The application should prompt the user to enter the amount to convert, the source currency, and the target currency.
2. Perform the currency conversion in a separate thread (user thread).
3. Implement a background thread (daemon thread) that periodically prints a message to the console, simulating a background process such as monitoring exchange rates.
4. Ensure that the main application waits for the user thread to complete the conversion before exiting.
5. The daemon thread should not prevent the application from exiting.

#### Starter Code:
```java
import java.util.Scanner;

public class CurrencyConverterApp {

    // Simulates currency conversion rates (e.g., USD to EUR)
    private static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // For simplicity, assume a fixed conversion rate
        double conversionRate = 0.85; // Example rate: 1 USD = 0.85 EUR
        return amount * conversionRate;
    }

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
        // your code here

        // Create and start the background daemon thread
        // your code here

        // Wait for the conversion thread to complete
        // your code here

        // Close the scanner
        scanner.close();
    }
}
```

#### Assignment Instructions:
1. Complete the `main` method by creating a user thread that calls the `convertCurrency` method with the user's input and prints the result.
2. Create a daemon thread that prints a message like "Monitoring exchange rates..." every 5 seconds.
3. Start both threads and ensure that the main thread waits for the conversion to complete before exiting.
4. The daemon thread should not prevent the program from exiting once the conversion is done.

#### Tips:
- Use the `Thread` class to create both user and daemon threads.
- Override the `run` method to specify the task each thread should perform.
- Use `Thread.sleep` in the daemon thread to create the delay.
- Set the daemon thread as a daemon using the `setDaemon` method before starting it.
- Use `thread.join()` to wait for the user thread to complete.

#### Submission:
Submit your completed `CurrencyConverterApp.java` file with the required functionality implemented. Make sure to test your application with different inputs to ensure it works as expected.
