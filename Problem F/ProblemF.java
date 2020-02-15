import java.io.*;
import java.util.*;

/**
 * The sixth problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemF
{
    public static void main(String[] args)
    {
    	double miles;
    	double mpg;
    	double gasUsed;
    	double gasTank;
    	double finalGasTank;
    	double predictedMiles;
    	Scanner scnr = new Scanner(System.in);

        miles = scnr.nextDouble();
        scnr.nextLine();

        mpg = scnr.nextDouble();
        gasUsed = miles / mpg; 
        scnr.nextLine();
        
        gasTank = scnr.nextDouble();
        finalGasTank = gasTank - gasUsed;
        predictedMiles = finalGasTank * mpg;
        
        if(gasUsed > gasTank)
        {
            gasUsed = gasTank;
            miles = gasTank * mpg;
            predictedMiles = 0;
        }
        
        scnr.nextLine();
        
        double price = scnr.nextDouble();
        double cost = price * gasUsed;
        //scnr.nextLine();
        
        System.out.printf("Jaffy drove for %.2f miles!\n", miles);
        System.out.printf("Jaffy used %.2f gallons of gas!\n", gasUsed);
        System.out.printf("Jaffy can drive for %.2f more miles!\n", predictedMiles);
        System.out.printf("It will cost Jaffy $%.2f to refill his tank!\n", cost);
    }
}
