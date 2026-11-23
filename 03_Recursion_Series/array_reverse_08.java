/*
  Given-:Reversing an array using recursion
  Concept used-:Recursion
  Time Complexity-:O(n).
*/

public class array_reverse_08 {
    public static void rev(int arr[],int i,int j){
        if(i>=j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        rev(arr,i+1,j-1);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        rev(array,0,5);
        for(int i=0;i<=5;i++){
            System.out.print(array[i]+" ");
        }
    }
}
