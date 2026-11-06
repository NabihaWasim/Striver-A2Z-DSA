/*
 Given Pattern-:Square with strats and spaces.
   **********
   ****  ****
   ***    ***
   **      **
   *        *
   *        *
   **      **
   ***    ***
   ****  ****
   **********
   Concept used-:Nested Loops with 3 inner loops for starts space then star.
 */

public class pattern_19 {
    public static void main(String[] args) {
        int space1=0;
        //upper part of square with decrement i
        for(int i=5;i>=1;i--){
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=0;j<space1;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            space1=space1+2;

        }
        int space2=8;
        //lower part of square with increment i
        
        for(int i=1;i<=5;i++){
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=0;j<space2;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            space2=space2-2;
    }
}  
}
