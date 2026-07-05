public class MaxMinArray {

    public static void findMaxMin(int[] arr) {

        // Assume first element is both max and min
        int max = arr[0];
        int min = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Number : " + max);
        System.out.println("Minimum Number : " + min);
    }

    public static void main(String[] args) {

        int[] numbers = {12, 45, 7, 89, 23, 56};

        findMaxMin(numbers);
    }
}