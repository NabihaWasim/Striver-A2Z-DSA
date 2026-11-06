/*
 Given Pattern-: Numbers and space the Numbers.
   1      1
   12    21
   123  321
   12344321
   Concept used-:Three loops in outer loops.
 */

public class pattern_13 {
    public static void main(String[] args) {
        int start=2*(5-1);
        for(int i=1;i<=5;i++){
            
            // for numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //for spaces
            for(int j=1;j<=start;j++){
                System.out.print(" ");
            }
            //for numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            
            System.out.println();
            start-=2;
        }
    }
}
