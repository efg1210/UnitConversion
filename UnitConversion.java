
import java.util.*;
import java.lang.*;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int inchesInM = 63360;
        final int feetInM = 5280;
        final int yardsInM = 1760;

        String origin = "";
        String destination = "";

        System.out.println("");
        do {
            System.out.print("Enter an origin unit: ");
            origin = in.next().toUpperCase();
        } while (!origin.equals("MILES"));
        
        boolean incorrectDest = true;
        do {
            System.out.print("Enter a destination unit: ");
            destination = in.next().toUpperCase();
            if (destination.equals("INCHES") || destination.equals("FEET") || destination.equals("YARDS")) {
                incorrectDest = false;
            }
        } while (incorrectDest);

        System.out.print("Enter a value: ");
        int value = in.nextInt();
        in.nextLine();
        
        in.close();
    }
}