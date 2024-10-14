public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 0;
        
        for (int i = 0; i < 10; i++) {
            sum += i;

        do {
            j++;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        } while (j < 10);
    }
    System.out.println(sum);
}
}
