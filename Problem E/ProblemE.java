import java.io.*;
import java.util.*;

/**
 * The fifth problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemE
{
    public static void main(String[] args)
    {
    	int numLines;
    	String[] lines;
    	double total;
    	int tempValue;
    	String tempOperand;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please input how many lines there are: ");
        numLines = scnr.nextInt();
        scnr.nextLine();

        lines = new String[numLines];
        
        for(int i = 0; i < numLines; ++i)
        {
        	System.out.print("Please input line " + (i+1) + ": ");
            lines[i] = scnr.nextLine();
        }  
        
        total = Double.parseDouble(lines[0]);

        for(int i = 2; i < numLines; i+=2)
        {
        	tempValue = Integer.parseInt(lines[i]);

            if(lines[i-1].equals("+"))
	        {
	            total = total + tempValue;
	        }
	        else if(lines[i-1].equals("-"))
	        {
	            total = total - tempValue;
	        }
	        else if(lines[i-1].equals("*"))
	        {
	            total = total * tempValue;
	        }
	        else if(lines[i-1].equals("/"))
	        {
	            total = total / tempValue;
	        }  
        }
        
        if(total % 1 > .90 || total % 1 == 0)
        {
        	System.out.printf("%.0f\n", total);
        }
        else
        {
        	System.out.printf("%.1f\n", total);
        }
    }
}