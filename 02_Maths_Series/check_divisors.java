/*
 Given Concept-:To find all the divisors of number.
 Concept used-:Usingb module to check if number is divisible 
 if leaves reminder 0.
 Time Complexity-: 0(n)
*/

public class check_divisors {
    public static void main(String[] args) {
        int n=36;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("total divisors are "+count);
    }
}
