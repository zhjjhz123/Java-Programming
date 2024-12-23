import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);

        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int randomIndex = (int)(Math.random() * m.length);
            int[] temp = m[i];
            m[i] = m[randomIndex];
            m[randomIndex] = temp;
        }
    }
}
