import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Create an array (using array initializer)
        String[] months = {"January", "February", "March", "April",
                           "May", "June", "July", "August",
                           "September", "October", "November", "December"};

        System.out.print("Enter a month number (1 to 12): ");
        Scanner input = new Scanner(System.in);
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
        input.close();
    }
}
