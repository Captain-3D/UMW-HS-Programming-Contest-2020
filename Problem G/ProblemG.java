import java.io.*;
import java.util.*;

/**
 * The seventh problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemG
{
    public static void main(String[] args)
    {
    	int degrees;
    	String[][] picture = new String[10][10];
    	String[][] newPicture = new String[10][10];
    	String tempLine;
    	Scanner scnr = new Scanner(System.in);

    	System.out.print("Please input the degrees Jaffy wants to rotate the picture: ");
		degrees = scnr.nextInt();
        scnr.nextLine();

        for(int i = 0; i < 10; i++)
        {
        	System.out.print("Please input line " + (i+1) + " of the picture: ");
			tempLine = scnr.nextLine();

            picture[i] = tempLine.split("\\s");
        }

        if(degrees == 0 || degrees == 360)
        {
        	for(int i = 0; i < 10; i++)
        	{
        		for(int j = 0; j < 9; j++)
	        	{
		        	System.out.print(picture[i][j]);
		        	System.out.print(" ");
		        }
		        System.out.println(picture[i][9]);
		    }
        }
        else if(degrees == 90)
        {
        	for(int i = 9; i > -1; i--)
        	{
        		for(int j = 0; j < 9; j++)
	        	{
		        	System.out.print(picture[j][i]);
		        	System.out.print(" ");
		        }
		        System.out.println(picture[9][i]);
		    }
        }
        else if(degrees == 180)
        {
		    for(int i = 9; i > -1; i--)
        	{
        		for(int j = 9; j > 0; j--)
	        	{
		        	System.out.print(picture[i][j]);
		        	System.out.print(" ");
		        }
		        System.out.println(picture[i][0]);
		    }
        }
        else if(degrees == 270)
        {
        	for(int i = 0; i < 10; i++)
        	{
        		for(int j = 9; j > 0; j--)
	        	{
		        	System.out.print(picture[j][i]);
		        	System.out.print(" ");
		        }
		        System.out.println(picture[0][i]);
		    }
        }
    }
}