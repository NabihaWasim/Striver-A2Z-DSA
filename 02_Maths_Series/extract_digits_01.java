/*
  Given-:A number is given with n number of digits,extract all digits one by one.
  Concept used-:Module(%) to find remainder
  Time Complexity-:O(log10(N)).
*/
public class extract_digits_01 {
    public static void main(String[] args) {
        int num=3456;
        int n;
        //loop untill the number becomes zero and all digist are extracted
        while(num>0){
            n=num%10;
            System.out.println("Digit is "+n);
            num=num/10; 
        }
    }
}
// % => gives the rermainder as output
// / => gives the quotient and drop the remainder