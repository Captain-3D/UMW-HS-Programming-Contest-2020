import java.io.*;
import java.util.*;

/**
 * The tenth problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemJ
{
    public static void main(String[] args)
    {	
    	int numLines;
    	int northSouth = 0;
    	int eastWest = 0;
    	String facing = "north";
    	String[] line;
    	Scanner scnr = new Scanner(System.in);

		numLines = scnr.nextInt();
        scnr.nextLine();

        for(int i = 0; i < numLines; i++)
        {
			line = scnr.nextLine().split("\\s");

			if(line[0].equals("Walk"))
			{
				if(facing.equals("north"))
				{
					northSouth = northSouth + Integer.parseInt(line[1]);
				}
				else if(facing.equals("south"))
				{
					northSouth = northSouth - Integer.parseInt(line[1]);
				}
				else if(facing.equals("east"))
				{
					eastWest = eastWest + Integer.parseInt(line[1]);
				}
				else if(facing.equals("west"))
				{
					eastWest = eastWest - Integer.parseInt(line[1]);
				}
			}
			else
			{
				facing = line[1];
			}
        }

        if(northSouth == 0 && eastWest == 0)
        {
        	System.out.println("Treasure is right here.");
        }
        else
        {
        	System.out.print("Treasure is ");
        	if(northSouth > 0)
        	{
        		System.out.print(northSouth + " paces to the north");
        	}
        	else if(northSouth < 0)
        	{
        		System.out.print((northSouth * -1) + " paces to the south");
        	}

        	if(eastWest != 0 && northSouth != 0)
        	{
        		System.out.print(" and ");
        	}

        	if(eastWest > 0)
	        {
	        	System.out.print(eastWest + " paces to the east");
	        }
	        else if(eastWest < 0)
	        {
	        	System.out.print((eastWest * -1) + " paces to the west");
	        }
        	
        	System.out.println(".");
        }
    }
}