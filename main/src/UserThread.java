public class UserThread extends Thread{

    // Simulates currency conversion rates (e.g., USD to EUR)
    private static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // For simplicity, assume a fixed conversion rate
        double conversionRate = 0.85; // Example rate: 1 USD = 0.85 EUR
        return amount * conversionRate;
    }

    private double amount;
    private String fromCurrency;
    private String toCurrency;

    public UserThread(double amount, String fromCurrency, String toCurrency) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    @Override
    public void run() {
        double result = convertCurrency(amount, fromCurrency, toCurrency);
        System.out.println("Conversion result: " + result);
    }

}
