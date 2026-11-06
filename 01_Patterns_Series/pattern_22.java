/*
  Given Pattern-: square of numbers with boundary as 4
    4444444
    4333334
    4322234
    4321234
    4322234
    4333334
    4444444
    Concept used-:Nested Loops with if else condition(4 at boundaries only)
*/

public class pattern_22 {
    public static void main(String[] args) {
        //outer loops runs for 7 times
        for(int i=1;i<=7;i++){
            //ineer loop for boundary
            for(int j=1;j<=7;j++){
                if(i==7||i==1||j==7||j==1){
                    System.out.print("4");
                }
                else if(i==2||i==6||j==2||j==6){
                    System.out.print("3");
                }
                else if(i==3||i==5||j==3||j==5){
                    System.out.print("2");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    
}
