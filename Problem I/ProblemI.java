import java.io.*;
import java.util.*;

/**
 * The ninth problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemI
{
    public static void main(String[] args)
    {	
    	int pairs;
    	String[][] keyAndMessage;
    	char tempChar;
    	String[] decryptedMessages;
    	Scanner scnr = new Scanner(System.in);

		pairs = scnr.nextInt();
        scnr.nextLine();

        keyAndMessage = new String[pairs][2];
        decryptedMessages = new String[pairs];

        for(int i = 0; i < pairs; i++)
        {
			keyAndMessage[i][0] = scnr.nextLine();

			keyAndMessage[i][1] = scnr.nextLine();
        }
        for(int i = 0; i < pairs; i++)
        {
	        for(int j = 0; j < keyAndMessage[i][1].length(); ++j)
	        {
				tempChar = keyAndMessage[i][1].charAt(j);
				
				if(tempChar >= 'a' && tempChar <= 'z')
				{
		            tempChar = (char)(tempChar - Integer.parseInt(keyAndMessage[i][0]));
		            
		            if(tempChar < 'a')
		            {
		                tempChar = (char)(tempChar + 'z' - 'a' + 1);
		            }
		            
		            if(decryptedMessages[i] != null)
		        	{
		        		decryptedMessages[i] += tempChar;
		        	}
		        	else
		        	{
		        		decryptedMessages[i] = String.valueOf(tempChar);
		        	}
		        }
		        else if(tempChar >= 'A' && tempChar <= 'Z')
		        {
		            tempChar = (char)(tempChar - Integer.parseInt(keyAndMessage[i][0]));
		            
		            if(tempChar < 'A')
		            {
		                tempChar = (char)(tempChar + 'Z' - 'A' + 1);
		            }
		            
		            if(decryptedMessages[i] != null)
		        	{
		        		decryptedMessages[i] += tempChar;
		        	}
		        	else
		        	{
		        		decryptedMessages[i] = String.valueOf(tempChar);
		        	}
		        }
		        else
		        {

		        	if(decryptedMessages[i] != null)
		        	{
		        		decryptedMessages[i] += tempChar;
		        	}
		        	else
		        	{
		        		decryptedMessages[i] = String.valueOf(tempChar);
		        	}
		        }
			}
		}

		for(int i = 0; i < pairs; i++)
        {
        	System.out.println(decryptedMessages[i]);
        }

		System.out.println("Traversed the Minefield!");
    }
}