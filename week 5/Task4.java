public class Task4 {
    public static void main(String[] args) {
        System.out.println("Math.max(2, 3) = " + Math.max(2, 3));
        System.out.println("Math.min(2.5, 4.6) = " + Math.min(2.5, 4.6));
        
        double maxVal = Math.max(2.5, 4.6);
        double minVal = Math.min(3, 5.6);
        System.out.println("Math.max(2.5, 4.6), Math.min(3, 5.6)) = " + Math.max(maxVal, minVal));
        
        System.out.println("Math.abs(-2) = " + Math.abs(-2));
        System.out.println("Math.abs(-2.1) = " + Math.abs(-2.1));

        int random1 = (int) (Math.random() * 10);
        System.out.println("(int) (Math.random() * 10) = " + random1 );

        int random2 = 50 + (int) (Math.random() * 50);
        System.out.println("(50 + (int) (Math.random() * 50)) = " + random2 );
        
        int a = 20; 
        int b = 30; 
        int random3 = a + (int) (Math.random() * b);
        System.out.println("a + (int) (Math.random() * b) = " + random3 );
    }
}
