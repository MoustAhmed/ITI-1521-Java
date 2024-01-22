public class Q3_ArrayInsertionDemo {

    public static int[] insertIntoArray(int[] array, int index, int element) {
        if (index < 0 || index > array.length) {
            System.out.println("Index hors limites.");
            return array;
        }
        int[] modifiedArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            modifiedArray[i] = array[i];
        }
        modifiedArray[index] = element;
        for (int i = index + 1; i < modifiedArray.length; i++) {
            modifiedArray[i] = array[i - 1];
        }

        return modifiedArray;
    }

    public static void main(String[] args) {

        int[] originalArray = { 1, 5, 4, 7, 9, 6 };

        System.out.println("Array avant l'insertion:");

        for (int element : originalArray) {
            System.out.println(element);
        }

        int position = 3;
        int number = 15;

        int[] newArray = insertIntoArray(originalArray, position, number);
        System.out.println("Array après l'insertion de " + number + " à position " + position + ":");
        for (int element : newArray) {
            System.out.println(element);
        }
    }

}
