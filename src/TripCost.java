
import java.util.Scanner;

public class TripCost {


    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("How much does your vehicle burn per kilometer ? : ");
        double cent = scanner.nextDouble();
        
        System.out.println("How many kilometers did you travel with your vehicle ? : ");
        int km = scanner.nextInt();
        
        System.out.println("Total amount you have to pay : " + (cent * km)+ "euro");
        
        
    }
    
}
