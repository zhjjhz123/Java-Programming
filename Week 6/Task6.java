import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int data;   
        int sum = 0; 
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number (0 to exit)：");
            data = input.nextInt();
            sum += data; 
        } while (data != 0); 

        System.out.println("The sum is：" + sum);

        input.close();
    }
}
