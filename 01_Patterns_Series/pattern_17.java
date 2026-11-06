/*
 Given Pattern-:Righat angled Triangle of natural Alphabets.
     A
     B B
     C C C
     D D D D
     E E E E E
  Concept used-: Nested Loops using char inplace of int in inner loop.
 */

public class pattern_17{
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }
    
}
