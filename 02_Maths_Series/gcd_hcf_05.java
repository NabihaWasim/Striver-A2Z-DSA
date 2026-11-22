/*
 Given-: To find the Greatest common Divisor and Highest Common Factor.
 Concept used-: Loop until we find factor highest for both numbers.
 Time Complexity-: O(N)  Brute force
*/

public class gcd_hcf_05 {
    public static void main(String[] args) {
        int n1=32;
        int n2=40;
        int count=0;
        int gcd=0;
        for(int i=1;i<Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
