import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = findGCD(n1, n2);

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }

    public static int findGCD(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
