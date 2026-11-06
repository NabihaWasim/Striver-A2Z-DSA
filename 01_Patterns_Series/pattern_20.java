/*
  Given Pattern-:Wing of stars
   *      *
   **    **
   ***  ***
   ********
   ***  ***
   **    **
   *      *
   Concept used-: Nested loops with dividing pattern into two parts
 */

public class pattern_20 {
    public static void main(String[] args) {
        //for upper part of pattern increment i 
        int space1=6;
        for(int i=1;i<=4;i++){
            //for stars(Right angled triangle)
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=space1;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            space1=space1-2;
        }
        //for lower part of pattern decrement i 
        int space2=2;
        for(int i=3;i>=1;i--){
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=1;j<=space2;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
                space2=space2+2;
        }
    }
    
}
