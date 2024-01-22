public class DaemonThread extends Thread{

    // Simulates currency conversion rates (e.g., USD to EUR)
    private static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // For simplicity, assume a fixed conversion rate
        double conversionRate = 0.85; // Example rate: 1 USD = 0.85 EUR
        return amount * conversionRate;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Monitoring exchange rates...");
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
