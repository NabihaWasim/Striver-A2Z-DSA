/*
  Given Pattern-:Hollow square of stars
    ****
    *  *
    *  *
    ****
    Concept used-:Nested Loops with if else condition(Stars at boundaries only)
*/

public class pattern_21 {
    public static void main(String[] args) {
        //Outer loop
        for(int i=1;i<=4;i++){
            //inner loops with condition
            for(int j=1;j<=4;j++){
                //condition for boundaries
                if(j==1 ||j==4 || i==1 || i==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }

    }
    
}
