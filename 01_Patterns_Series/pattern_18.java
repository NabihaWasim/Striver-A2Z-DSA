
/*
 Given Pattern-:Pyramidof  Alphabets.
         A
       A B A
     A B C B A
   A B C D C B A   
  Concept -: Nested Loops .
 */ 

public class pattern_18 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            //for space reverse of i
            for(int j=3 ;j>=i;j--){
                System.out.print("  ");
            }
            //for alphabets
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            for(char j=(char)('A'+i-1);j>='A';j--){
                System.out.print(j+" ");
            }
            //for space
            //for(int j=3;j>=i;j--){
              //  System.out.print(" ");
            //}
            System.out.println();

        }
        
    }
    

}
