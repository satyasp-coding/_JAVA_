import java.util.*;
public class EVEN_ODD_SUM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice = 1;
        
        while (choice == 1) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            
            System.out.print("Do you want to continue? Press 1 for yes or press 0 for no: ");
            choice = sc.nextInt();
        }
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
