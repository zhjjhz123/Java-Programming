public class Task14 {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;
        double rate = 0.07;
        
        while (tuition < 2 * 10000) {
            tuition += tuition * rate;
            year++;
        }
        
        System.out.println("Tuition will be doubled in " + year + " years.");
        System.out.printf("Tuition will be $%.2f in %d years%n", tuition, year);
    }
}