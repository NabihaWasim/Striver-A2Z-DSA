/*
  Given-:A number is given with n number of digits,count all digits one by one.
  Concept used-:Module(%) to find remainder and increase the count
  Time Complexity-:O(log10(N)).
*/

public class countDigits_02 {
    public static void main(String[] args) {
        int num=3456;
        int count=0;
        int n;
        //loop untill the number becomes zero and all digist are counted
        while(num>0){
            n=num%10;
            count++;
            num=num/10; 
        }
        System.out.println(count);
    }
}
