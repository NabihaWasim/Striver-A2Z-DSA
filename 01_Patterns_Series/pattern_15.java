
/*
 Given Pattern-:Righat angled Triangle of natural Alphabets.
     A
     A B
     A B C
     A B C D
     A B C D E
  Concept used-: Nested Loops using char inplace of int in inner loop.
 */

public class pattern_15 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
