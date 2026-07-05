public class LargestElement {
    public static void main(String args[]){
        int arr[] = {10,70,30,20,55,60,88,12,45};
        int max = arr[0]; // Assume that the First element is Largest

        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Find the Largest element in the array:" +max);
    }
    
}
