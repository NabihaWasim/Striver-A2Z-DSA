/*
  Given-:Paramterized recusrsion to print natural numebrs sum untill base condition 
  Concept used-:Parameterized Recusrion(Function calling itself).
  Time Complexity-:O(N).
*/

public class parameterized_recursion_06 {
    public static void sum(int i,int n){
        if(i==0){
            System.out.println(n);
            return;
        }
        sum(i-1,n+i);
    }
    public static void main(String[] args) {
        sum(3,0);
    }
    
}
