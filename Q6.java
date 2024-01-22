import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] arguments) {
        try (Scanner inputScanner = new Scanner(System.in)) {

            double[] studentGrades = new double[10];

            for (int index = 0; index < 10; index++) {
                System.out.print("Enter grade #" + (index + 1) + ": ");
                studentGrades[index] = inputScanner.nextDouble();
            }

            // Call the methods and print the results
            System.out.println("Average: " + calculateAverage(studentGrades));
            System.out.println("Median: " + calculateMedian(studentGrades));
            System.out.println("Number of students failed: " + calculateNumberFailed(studentGrades));
            System.out.println("Number of students passed: " + calculateNumberPassed(studentGrades));
        }
    }

    public static double calculateAverage(double[] grades) {
        double total = 0;
        for (double grade : grades) {

            total += grade;
        }
        return total / grades.length;
    }

    public static double calculateMedian(double[] grades) {
        Arrays.sort(grades);

        // Calculate the median
        if (grades.length % 2 == 0) {
            int mid1 = grades.length / 2 - 1;

            int mid2 = grades.length / 2;
            return (grades[mid1] + grades[mid2]) / 2;
        } else {
            int mid = grades.length / 2;
            return grades[mid];
        }
    }

    public static int calculateNumberFailed(double[] grades) {
        int failedCount = 0;
        for (double grade : grades) {
            if (grade < 50) {
                failedCount++;
            }
        }
        return failedCount;
    }

    public static int calculateNumberPassed(double[] grades) {
        int passedCount = 0;
        for (double grade : grades) {
            if (grade >= 50) {
                passedCount++;
            }
        }
        return passedCount;
    }
}
