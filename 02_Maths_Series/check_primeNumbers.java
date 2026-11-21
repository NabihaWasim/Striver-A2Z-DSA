/*
 Given Concept-:To check if the number is prime number.
 Concept used-:Usingb module to check if number is divisible ny any other number 
 if leaves reminder 0.
 Time Complexity-: 0(n)
*/

public class check_primeNumbers {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("Number is not prime");
        }else{
            System.out.println("NUmber is prime");
        }
    }
    
}
