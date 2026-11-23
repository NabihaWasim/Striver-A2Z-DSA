/*
  Given-:Basic recusrsion to print natural numebrs in reverse n to 1 untill
  base condition met(0)
  Concept used-:Recusrion(Function calling itself).
  Time Complexity-:O(N).
*/

public class numbers_nto1_04 {
    public static void printnum(int n){
        if(n==0){
            System.out.println("Condition met");
            return;
        }
        System.out.print(n+" ");
        printnum(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("recursion:");
        printnum(10);  
    }
}
