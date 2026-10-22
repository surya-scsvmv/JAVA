// Case study extension: ATM with a daily withdrawal limit.
// Compile: javac AtmDailyLimit.java
// Run:     java AtmDailyLimit

class DailyLimitExceededException extends Exception {
    DailyLimitExceededException(String message) {
        super(message);
    }
}

public class AtmDailyLimit {
    private static double balance = 12000.0;
    private static double withdrawnToday = 0.0;
    private static final double DAILY_LIMIT = 5000.0;

    private static void withdraw(double amount)
            throws InvalidAmountException, LowBalanceException, DailyLimitExceededException {
        if (amount <= 0 || amount % 100 != 0) {
            throw new InvalidAmountException("Amount must be positive and a multiple of 100.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance. Available: Rs. " + balance);
        }
        if (withdrawnToday + amount > DAILY_LIMIT) {
            throw new DailyLimitExceededException(
                "Daily limit is Rs. " + DAILY_LIMIT + "; already withdrawn: Rs. " + withdrawnToday
            );
        }

        balance -= amount;
        withdrawnToday += amount;
        System.out.printf("Withdrawal successful: Rs. %.2f | Balance: Rs. %.2f%n", amount, balance);
    }

    public static void main(String[] args) {
        double[] requests = {2000, 2500, 1000, 500};
        for (double amount : requests) {
            try {
                withdraw(amount);
            } catch (InvalidAmountException | LowBalanceException | DailyLimitExceededException ex) {
                System.out.println("Transaction declined: " + ex.getMessage());
            }
        }
        System.out.printf("Withdrawn today: Rs. %.2f%n", withdrawnToday);
        System.out.printf("Remaining balance: Rs. %.2f%n", balance);
    }
}

/*
Withdrawal successful: Rs. 2000.00 | Balance: Rs. 10000.00
Withdrawal successful: Rs. 2500.00 | Balance: Rs. 7500.00
Transaction declined: Daily limit is Rs. 5000.0; already withdrawn: Rs. 4500.0
Withdrawal successful: Rs. 500.00 | Balance: Rs. 7000.00
Withdrawn today: Rs. 5000.00
Remaining balance: Rs. 7000.00
*/
