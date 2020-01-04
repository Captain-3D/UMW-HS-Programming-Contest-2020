import java.io.*;
import java.util.*;

/**
 * The second problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemB
{
    public static void main(String[] args)
    {
    	int pairs;
        int giraffeA;
        int giraffeB;
        int[] giraffeTotals;
    	Scanner scnr = new Scanner(System.in);

		System.out.print("Please input how many pairs of giraffes that Aunt Gingerbread has counted: ");
        pairs = scnr.nextInt();
        scnr.nextLine();

        giraffeTotals = new int[pairs];

        for(int i = 0; i < pairs; i++)
        {
            int pairCount = i + 1;
            System.out.print("Please input how many spots were on giraffe 1, pair " + pairCount + ": ");
            giraffeA = scnr.nextInt();
            scnr.nextLine();

            System.out.print("Please input how many spots were on giraffe 2, pair " + pairCount + ": ");
            giraffeB = scnr.nextInt();
            scnr.nextLine();

            giraffeTotals[i] = giraffeA + giraffeB;
        }

        for(int i = 0; i < pairs; i++)
        {
            System.out.println(giraffeTotals[i]);
        }
    }
}