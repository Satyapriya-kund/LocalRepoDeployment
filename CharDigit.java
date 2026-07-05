//Take a input String and Separate the Character aswell as Integer
public class CharDigit {
    public static void main(String args[]){
        String input = "abc123def456";

        String letters = " ";
        String digits = " ";

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(Character.isLetter(ch)){
                letters += ch;
            }else if(Character.isDigit(ch)){
                digits += ch;
            }
        }
        System.out.println("Original String:" +input);
        System.out.println("Letters:" +letters);
        System.out.println("digits: " +digits);
    }
}
