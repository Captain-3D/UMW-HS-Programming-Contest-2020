import java.io.*;
import java.util.*;

/**
 * The thrid problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemC
{
    public static void main(String[] args)
    {
    	int facetimeCalls;
        double rateOfGrowth = 0.5;
        int jessiesHeight = 3;
        double jessiesNewHeight;
		double jessiesNewHeightInches;
    	Scanner scnr = new Scanner(System.in);
        
        facetimeCalls = scnr.nextInt();
        //scnr.nextLine();

        jessiesNewHeight = jessiesHeight + (rateOfGrowth * facetimeCalls);
        jessiesNewHeightInches = jessiesNewHeight % 1;
        jessiesNewHeight = jessiesNewHeight - jessiesNewHeightInches;

        if(jessiesNewHeight > 19)
        {
        	if(jessiesNewHeightInches == 0.5)
        	{
        		System.out.printf("Jessie’s height is %.0f and 1 half feet!\n", jessiesNewHeight);
        	}
        	else
        	{
        		System.out.printf("Jessie’s height is %.0f feet!\n", jessiesNewHeight);
        	}
        }
        else
        {
			if(jessiesNewHeightInches == 0.5)
        	{
        		System.out.printf("Jessie’s height is %.0f and 1 half feet.\n", jessiesNewHeight);
        	}
        	else
        	{
        		System.out.printf("Jessie’s height is %.0f feet.\n", jessiesNewHeight);
        	}
        }
        
    }
}
