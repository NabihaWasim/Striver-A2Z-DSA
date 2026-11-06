
/*
 Given Pattern-:Righat angled Triangle of Stars then INverted triangle onwards.
     * 
     ** 
     *** 
     ****
     *****
     ****
     **
     *
  Concept used-: Nested Loops.
 */

public class pattern_11 {
    public static void main(String[] args) {
        int n=5;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
