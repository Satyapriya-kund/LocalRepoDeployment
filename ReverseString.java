//Write a Program to Reverse a String

public class ReverseString{
    public static void main(String args[]){
        String str = "Master Java Programming";
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);
    }
}