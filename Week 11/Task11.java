public class Task11 {
    public static void main(String[] args) {

        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8}, 
            {7, 3, 4, 3, 3, 4, 4}, 
            {3, 3, 4, 3, 3, 2, 2}, 
            {9, 3, 4, 7, 3, 4, 1}, 
            {3, 5, 4, 3, 6, 3, 8}, 
            {3, 4, 4, 6, 3, 4, 4}, 
            {3, 7, 4, 8, 3, 8, 4}, 
            {6, 3, 5, 9, 2, 7, 9}  
        };

        int numberOfEmployees = hours.length;
        int[] totalHours = new int[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                totalHours[i] += hours[i][j];
            }
        }

        Integer[] employeeIndexes = new Integer[numberOfEmployees];
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeIndexes[i] = i;
        }

        java.util.Arrays.sort(employeeIndexes, (a, b) -> totalHours[b] - totalHours[a]);
        System.out.println("Employees sorted by total hours:");
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee " + employeeIndexes[i] + ": " + totalHours[employeeIndexes[i]]);
        }
    }
}
