/*
  Given-:Functional recusrsion to print natural numebrs sum untill base condition 
  Concept used-:Functional Recusrion(Function calling itself).
  Time Complexity-:O(N).
*/

public class functional_recursion_07 {
    public static int sum(int n){
        if(n==5){ //sum till 4
            return 0;
        }
        return n+sum(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println(sum(n));
    }
}
