public class Q3_AverageDemo {

    public static void main(String[] arguments) {
        double[] inputArray;
        inputArray = new double[] { 100.0, 34.0, 72.0, 56.0, 82.0, 67.0, 94.0 };
        System.out.println("The average is: " + calculateAverage(inputArray));
    }

    // method that calculates the average of the numbers in an array
    public static double calculateAverage(double[] numbers) {
        double sumTotal;
        sumTotal = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumTotal += numbers[i];
        }
        double averageValue = sumTotal / numbers.length;
        return averageValue;
    }
}
