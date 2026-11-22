/*
  Given-:Basic recusrsion to print natural numbers untill base condition met(11).
  Concept used-:Recusrion(Function calling itself).
  Time Complexity-:O(N).
*/

public class number_1ton_02 {
    public static void numbers(int n){
        if(n==11){
            return;
        }
        System.out.print(n+" ");
        numbers(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        numbers(n);
    }
}
