import java.util.*;
 public class ALL_PATTERN {


    // ............ hollow rectangle pattern
    //.................... (1) logic ----- total no fo lines ----- 1 to 4 total rows
    //............. (2) row = || col = 1 || row = 4 || col =5








    public static void hollow_rectangle(int R, int C){
        // ..........outer loop
        for(int i=1; i <= R; i++) {
            //..........inner - columns
            for(int j=1; j <= C; j++) {
                //.........cell -(i, j)
                if(i == 1 || i == R || j ==1 || j == C){
                    System.out.print("*");
                }else {
                    System.out.print(" ");

                }      
            }
            System.out.println();
        }
    }
    // public static void main(String args[]){
    //     hollow_rectangle(9, 7);
    // }
    


    // ..........inverted and rotated half-pyramid
    // (1)--think about martix...[] and empty spaces.....
    // logic----(2) outer loop ----rows
    /* spaces and stars 
    print the stars according to no of rows*/



     ////inverted_rotated_half_pyramid
    public static void inverted_rotated_half_pyramid (int n) {
        //outer no of rows........
        for(int i=1; i<=n; i++){
            //spaces in matrix.....
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // print stars *.......
            for(int j=1; j<=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    // public static void main(String args[]){
    //     inverted_rotated_half_pyramid(7); 
    // } 










    public static void inverted_rotated_half_pyramid_with_num(int n){
        for(int i=1; i<=n; i++){
            //innrer loop to repreasent the numbers
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            } System.out.println();
        }
       
    }
    // public static void main(String args[]){
    //     inverted_rotated_half_pyramid_with_num(5);
    // }














  // Floid's triangle
  public static void  floids_triangle(int n){
    int counter = 1;
    // outer.....
    for(int i=1; i<=n; i++){
        // inner loop.........
        for(int j=1; j<=i; j++) {
            System.out.print(counter+" ");
            counter ++;
        }
        System.out.println();

    }
   // }  public static void main(String args[]){
  //     floids_triangle(30);
  }













        // zero_one triangle

        public static void zero_one_triangle(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    if((i+j) % 2 == 0) {
                    System.out.print("1");
                    }
                    else{
                    System.out.print("0");
                    }

                }
                System.out.println();
            }
            

        }
        //  public static void main(String args[]) {
            //      zero_one_triangle(6);
        //    }














    public static void butter_fly(int n){
        for(int i=1; i<=n; i++) {
            //stars---i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces--2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars...i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
        // Scaond_half of butterfly
        for(int i=n; i>=1; i--){
            //stars---i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces--2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars...i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void main(String args[]){
        butter_fly(10);
    }

}