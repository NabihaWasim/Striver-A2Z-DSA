/*
Given Pattern-:Inverted Righat angled Triangle of natural numbers.
     A B C D E
     A B C D
     A B C
     A B 
     A 
  Concept used-: Nested Loops using char inplace of int in inner loop.
*/

public class pattern_16 {
    public static void main(String[] args) {
        for(int i=5;i>=0;i--){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
