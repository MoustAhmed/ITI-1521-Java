public class Q3_SquareArray {

    public static int[] createArray(int size) {

        int[] resultArray = new int[size];

        for (int i = 0; i < size; i++) {
            resultArray[i] = i * i;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int customSize = 13;
        int[] customArray = createArray(customSize);

        for (int i = 0; i < customArray.length; i++) {
            System.out.println("The square of " + i + " is: " + customArray[i]);
        }
    }
}
