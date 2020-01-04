import java.io.*;
import java.util.*;

/**
 * The first problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemA
{
    public static void main(String[] args) throws IOException
    {
    	int ageDifference = 30;
    	int jaffysAge;
    	int jaqaruesAge;
    	Scanner scnr = new Scanner(System.in);

		System.out.print("Please input Jaffys age: ");
        jaffysAge = scnr.nextInt();
        scnr.nextLine();

        jaqaruesAge = jaffysAge + ageDifference;

        System.out.println("Uncle Jaqarue is " + jaqaruesAge + " years old.");
    }
}