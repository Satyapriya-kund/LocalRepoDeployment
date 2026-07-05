// Write a Java program and find out the Character Occurence in the Program without using the HashMap.

public class CharacterOccurence {

    public static void main(String args[]){
        String input = "Ready for Automation/SDET Profile";

        input = input.toLowerCase(); //normalize input

        int count[] = new int[256]; //ASCII Character Count Array

        //Count Occurence of Each character
        for(int i=0; i<input.length(); i++){
            count[input.charAt(i)]++;
        }
        System.out.println("Character Occurence in the given String: ");

        //Display Character that appears atleast Once
        for(int i=0; i<256; i++){
            if(count[i] > 0){
                System.out.println((char) i + " : " +count[i]);
            }
        }
    }
    
}
