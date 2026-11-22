/*
  Given-:Basic recusrsion to print 'hey' untill base condition met
  Concept used-:Recusrion(Function calling itself).
  Time Complexity-:O(N).
*/

public class recusrion_basics{
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Hey");
        print(n-1);
    }

    public static void main(String[] args) {
        print(4);
    }
}
