import java.io.*;
import java.util.*;

/**
 * The eleventh problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemK
{
    public static void main(String[] args)
    {	
    	int pairs;
    	double[] mphs;
    	double[] distances;
        double hours;
        double minutes;
        double seconds;
    	Scanner scnr = new Scanner(System.in);

		pairs = scnr.nextInt();
        scnr.nextLine();

        mphs = new double[pairs];
    	distances = new double[pairs];

        for(int i = 0; i < pairs; i++)
        {
			mphs[i] = scnr.nextDouble();
        	scnr.nextLine();

			distances[i] = scnr.nextDouble();
        	scnr.nextLine();
        }

        for(int i = 0; i < pairs; i++)
        {
            hours = 0;
            minutes = 0;
            seconds = 0;

            hours = (distances[i] / mphs[i]);

            if(hours % 1 > 0)
            {
                minutes = (hours % 1) * 60;
                hours -= hours % 1;

                if(minutes % 1 > 0)
                {
                    seconds = (minutes % 1) * 60;
                    minutes -= minutes % 1;

                    if(seconds % 1 > 0)
                    {
                        seconds += 1;
                        seconds -= seconds % 1;

                        if(seconds >= 60)
                        {
                            seconds -= 60;
                            minutes += 1;

                            if(minutes >= 60)
                            {
                                minutes -= 60;
                                hours += 1;
                            }
                        }
                    }   
                }
            }  
            
            System.out.printf("Jaffy can bike the trail in %.0f hours, %.0f minutes, %.0f seconds.\n", hours, minutes, seconds);
        }
    }
}