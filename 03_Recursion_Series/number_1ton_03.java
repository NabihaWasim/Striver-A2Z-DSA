/*
  Given-:Basic recusrsion to print natural numebrs untill base condition met(11)
  Concept used-:Recusrion(Function calling itself).
  Time Complexity-:O(N).
*/

public class number_1ton_03{
    public static void numbers(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        numbers(i+1,n);
    }
    public static void main(String[] args) {
        int n=10;
        int i=1;
        numbers(i,n);
    }
}