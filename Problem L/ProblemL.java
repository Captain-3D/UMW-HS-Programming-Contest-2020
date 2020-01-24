import java.io.*;
import java.util.*;

/**
 * The eleventh problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemL
{
    public static void main(String[] args)
    {	
    	int tankOfWater;
        String[][] building;
        int floors;
        int rooms;
    	Scanner scnr = new Scanner(System.in);

		tankOfWater = scnr.nextInt();
        scnr.nextLine();

        floors = scnr.nextInt();
        scnr.nextLine();

        rooms = scnr.nextInt();
        scnr.nextLine();

        building = new String[floors][rooms];

        for(int i = 0; i < floors; i++)
        {
            building[i] = scnr.nextLine().split("\\s");;
        }

        int floorCounter = 0;
        for(int i = (floors - 1); i > -1; i--)
        {
            floorCounter++;
            for(int j = 0; j < rooms; j++)
            {
                if(Integer.parseInt(building[i][j]) > 0)
                {
                    if(tankOfWater - Integer.parseInt(building[i][j]) <= 0)
                    {
                        System.out.println("The building is still burning!");
                        System.exit(0);
                    }
                    else
                    {
                        tankOfWater -= Integer.parseInt(building[i][j]);
                        System.out.println("Room " + (j+1) + ", Floor " + floorCounter);
                    }
                }
            } 
        }

        System.out.println("All room fires extinguished.");
    }
}