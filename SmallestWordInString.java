public class SmallestWordInString {
    public static void main(String[] args) {
        String str = "Selenium with Java automation testing";

        // Split the string into words
        String[] words = str.split(" ");

        // Assume first word is the smallest initially
        String smallest = words[0];

        // Loop through the words to find the smallest one
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }

        System.out.println("The smallest word in the string is: " + smallest);
        
    }
}