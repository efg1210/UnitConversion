
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
        float value = in.nextFloat();
        in.nextLine();

        double answer = 0;
        if (destination.equals("INCHES")) {
            answer = inchesInM * value;
            System.out.printf("\nThere are %,.1f inches in %.1f miles.", answer, value);
        } else if (destination.equals("FEET")) {
            answer = feetInM * value;
            System.out.printf("\nThere are %,.1f feet in %.1f miles.", answer, value);
        } else if (destination.equals("YARDS")) {
            answer = yardsInM * value;
            System.out.printf("\nThere are %,.1f yards in %.1f miles.", answer, value);
        }
        
        in.close();
    }
}