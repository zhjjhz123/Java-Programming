public class task {
    public static void main(String[] args) {
    System.out.printf("%-4s %-4s %-4s%n", "a", "a^2", "a^3");
    for (int a = 1; a <= 4; a++) {
     System.out.printf("%-4d %-4d %-4d%n", a, a * a, a * a * a);
        }
    }
}