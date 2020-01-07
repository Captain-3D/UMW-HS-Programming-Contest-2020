import java.io.*;
import java.util.*;

/**
 * The eleventh problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemN
{
    public static void main(String[] args)
    {	
        String stringBuffer;
        int guestCount = 0;
        int weddingDayTemp;
        double rateOfCooling;
        int temp;
        double newtonTime;
        String[] guestBuffer = new String[2];
        ArrayList<String> guestNames = new ArrayList<String>();
        ArrayList<Integer> guestPreferedTemps = new ArrayList<Integer>();
    	Scanner scnr = new Scanner(System.in);

		stringBuffer = scnr.nextLine();

        while(!stringBuffer.equals("."))
        {
            guestCount++;
            guestBuffer = stringBuffer.split("\\s");

            guestNames.add(guestBuffer[0]);
            guestPreferedTemps.add(Integer.parseInt(guestBuffer[1]));
        }

        weddingDayTemp = scnr.nextInt();
        scnr.nextLine();

        for(int i = 0; i < guestCount; i++)
        {
            rateOfCooling = (((Math.log(weddingDayTemp - 60)) / ((-weddingDayTemp) + 40) / 1));
            newtonTime = ((Math.log(((guestPreferedTemps.get(i) - weddingDayTemp)/(40-weddingDayTemp)) / (-rateOfCooling))));

            System.out.println("rateOfCooling = " + rateOfCooling);
            System.out.println("NewtonTime = " + newtonTime);

            if(guestPreferedTemps.get(i) > weddingDayTemp || guestPreferedTemps.get(i) < 40)
            {
                System.out.println(guestNames.get(i) + ": unable to get the right temperature.");
                
            }
            else
            {
                System.out.print(guestNames.get(i));
                System.out.printf(": remove bottle from fridge %.1f hours before the wedding.", newtonTime);
            }
        }
    }
}