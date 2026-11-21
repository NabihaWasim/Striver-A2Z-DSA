/*
 Given-: To check if given number is plaindrome print true if it is.
 Concept used-:Find reversed number then compare with original number.
 Time Complexity-:O(log10(N)).
*/

public class checkPalindrome_04 {
    public static void main(String[] args) {
        int num=12021;
        //reverse operation is perfornmed on number but original number is saved
        int original=num;
        int n;
        int reversed=0;
        while(num>0){
            n=num%10;
            //getting remainder and pritng it all toghether to get a new number with reversed digits
            reversed=reversed*10+n;
            num=num/10;
        }
        System.out.println(reversed);
        System.out.println();
        //comparison is perfornmed on original number because num became 0.
        if(original==reversed){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}    
