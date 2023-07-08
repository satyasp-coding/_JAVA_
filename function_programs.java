import java.util.*;
 public class function_programs {














//      public static int multiply(int a, int b) {
     
       
//         int prod = a * b;
//         return prod;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();


//         int prod = multiply(a, b);
//         System.out.println("prod is :"+prod);

       
//     }













    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
         f = f * i;
        }
        return f;
    }
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    // public static void main(String args[]) {
     //     System.out.println(binCoeff(5, 2));
    // }





    // sum of two number 


    // public static int sum(int a, int b) {
    //     return a + b;
    // }
    //     // sum of three number 


    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }




   
   //function to call int sum
    public static int sum( int a, int b) {
        return a+b;
    }


    // function to call float sum
    public static float sum( float a, float b) {
        return a+b;
    }
    // public static void main(String args[]) {          {{{{ <-----this function must use for calling every function}}}}
    // System.out.println(sum(3, 5));
    // System.out.println(sum(3.2f, 4.8f));
    // }



    //only for n>=2...................
    //cheak a number is prime or not---------------
    // public static boolean isPrime(int n) {
    //corner cases.......................
    //1.............................
    // if(n == 2) {
    //     return true;

    // }




    //     boolean isPrime = true;
    //     for(int i=2; i<=n-1; i++) {
    //         if(n % i == 0) { // completely deviding
    //           isPrime = false;
    //           return isPrime;
    //         }
    //     }
    //     return isPrime;
    // }    

   
    // optimized..................................

    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // public static void main(String args[]) {
    //     System.out.println(isPrime(7));   
    // }
    
    //................................................


    
    
    // print all prime in  a range
    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) { //true
            System.out.print(i+ " ");

            }
        }

        System.out.println();
    }

    // public static void main(String args[]) {
    //     primesInRange(100);   
    // }

    public static void binToDc(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decemal of " + mynum +" = " + decNum);
    }

    public static void main(String args[]) {
        binToDc(101);
    }








}
