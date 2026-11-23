/*
  Given-:Basic recusrsion to print natural numebrs in reverse n to 1 untill
  base condition met(0) using Backtracking.
  Concept used-:Recusrion(Function calling itself).
  Time Complexity-:O(N).
*/

public class number_1ton_Backtracking_04 {
    public static void numbers(int i){
        if(i==0){
            return;
        }
        numbers(i-1); //funtion call before print statement is called backtracking
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int i=10;
        numbers(i);
    }
}
