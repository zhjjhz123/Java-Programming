public class Task18 {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        
        System.out.println("Interest is $" + interest);
        System.out.printf("Interest with two decimal point is $%4.2f%n", interest);

        int count = 5;
        double amount2 = 45.56;
        System.out.printf("count is %8d and amount is %8f%n", count, amount2);
    }
}
