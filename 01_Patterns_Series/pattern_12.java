/*
 Given pattern-:Right angled tri9angle of 101 alternate  numbers
   1
   01
   101
   0101
   10101
  Concept used-: Nested Loops.
*/

public class pattern_12 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int start;
            if(i%2==0) start=0;
            else start=1;
            for(int j=0;j<i;j++){
                System.out.print(start);
                start=1-start;  //to alternate 0 and 1
            }
            System.out.println();   
        }
    }  
}
