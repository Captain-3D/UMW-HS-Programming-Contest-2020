import java.io.*;
import java.util.*;

/**
 * The sixth problem in the HS programming constest official solution code.
 */
public class ProblemFRound {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        double milesDriven = Double.parseDouble(in.nextLine());
        double mpg = Double.parseDouble(in.nextLine());
        double gasInTank = Double.parseDouble(in.nextLine());
        double price = Double.parseDouble(in.nextLine());
        double gasUsed = (milesDriven / mpg) < gasInTank ? (milesDriven / mpg) : gasInTank; 
        milesDriven = gasUsed < gasInTank ? milesDriven : gasInTank * mpg;
        double cost = price * gasUsed;
        double moreMiles = (gasInTank - gasUsed) * mpg;
        
        System.out.println("Jaffy drove for " + String.format("%.2f", milesDriven) + " miles!"); // 100th
        //System.out.println("Jaffy drove for " + String.format("%.1f", milesDriven) + " miles!"); // 10th
        System.out.println("Jaffy used " + String.format("%.2f", gasUsed) + " gallons of gas!"); // 100th
        System.out.println("Jaffy can drive for " + String.format("%.2f", moreMiles) + " more miles!"); // 100th
        System.out.println("It will cost Jaffy $"  + String.format("%.2f", cost) + " to refill his tank!");
    }
}
