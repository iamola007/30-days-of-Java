import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        // Reading the input array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Call the function to find the maximum hourglass sum
        int maxSum = findMaxHourglassSum(arr);
        System.out.println(maxSum);

        scanner.close();
    }

    public static int findMaxHourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE; // Initialize to a very small value

        // Iterate over possible hourglass starting points
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                // Calculate the hourglass sum
                int hourglassSum =
                        arr[i][j] + arr[i][j + 1] + arr[i][j + 2]  // Top row
                                + arr[i + 1][j + 1]                         // Middle element
                                + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]; // Bottom row

                // Update maxSum if the current hourglassSum is greater
                maxSum = Math.max(maxSum, hourglassSum);
            }
        }

        return maxSum;
    }
}
