//Duplicates and it's Occurences
import java.util.Arrays;
public class DuplicateOccurence {
    public static void main(String args[]){
        int numbers[] = {10,20,30,50,30,40,40,30,60,90,60,40};

        Arrays.sort(numbers); // Sorting the Element into Sequence
        
        System.out.println("Elements appearing two or More than 2 times:");

        for(int i=0; i<numbers.length-1; i++){
            int count = 1;

            while(i<numbers.length-1 && numbers[i] == numbers[i+1]){

                i++;
                count++;
            }
            if(count>=2){
                System.out.println(numbers [i] + " ->"+count +" Times");
            }


        }
    }
    
}
