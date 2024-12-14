public class LoanTest {
    public static void main(String[] args) {
        Loan loan = new Loan();
        System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
        System.out.println("Total Payment: " + loan.getTotalPayment());
    }
}
