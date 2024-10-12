import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();
        if (userInput.length() != 1 || !Character.isLetter(userInput.charAt(0))) {
            System.out.println(userInput + " is an invalid input");
            return;
        }
        char letter = Character.toLowerCase(userInput.charAt(0));
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(userInput + " is a vowel");
        } else {
            System.out.println(userInput + " is a consonant");
        }
    }
}
