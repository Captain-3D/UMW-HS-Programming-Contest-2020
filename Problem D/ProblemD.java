import java.io.*;
import java.util.*;

/**
 * The fourth problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemD
{
    public static void main(String[] args)
    {
    	int numBackpacks;
        double[] backpackWeights;
        double heaviestBackpack;
        double lightestBackpack;
        double sumOfBackpackWeights;
        double averageBackpackWeight;
    	Scanner scnr = new Scanner(System.in);

        numBackpacks = scnr.nextInt();
        scnr.nextLine();

        backpackWeights = new double[numBackpacks];

        for(int i = 0; i < numBackpacks; i++)
        {
        	int backpackCounter = i+1;
        	backpackWeights[i] = scnr.nextDouble();
        	scnr.nextLine();
        }

        heaviestBackpack = backpackWeights[0];
        lightestBackpack = backpackWeights[0];
        sumOfBackpackWeights = backpackWeights[0];

        for(int i = 1; i < numBackpacks; i++)
        {
        	if(backpackWeights[i] > heaviestBackpack)
        	{
        		heaviestBackpack = backpackWeights[i];
        	}

        	if(backpackWeights[i] < lightestBackpack)
        	{
        		lightestBackpack = backpackWeights[i];
        	}

        	sumOfBackpackWeights = sumOfBackpackWeights + backpackWeights[i];
        }

        averageBackpackWeight = sumOfBackpackWeights / numBackpacks;

        if(heaviestBackpack % 1 > .90)
        {
        	System.out.printf("Heaviest backpack: %.0f\n", heaviestBackpack);
        }
        else
        {
        	System.out.printf("Heaviest backpack: %.1f\n", heaviestBackpack);
        }
        if(lightestBackpack % 1 > .90)
        {
        	System.out.printf("Lightest backpack: %.0f\n", lightestBackpack);
        }
        else
        {
        	System.out.printf("Lightest backpack: %.1f\n", lightestBackpack);
        }
        if(averageBackpackWeight % 1 > .90)
        {
        	System.out.printf("Average weight of all backpacks: %.0f\n", averageBackpackWeight);
        }
        else
        {
        	System.out.printf("Average weight of all backpacks: %.1f\n", averageBackpackWeight);
        }
        
    }
}