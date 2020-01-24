import java.io.*;
import java.util.*;

/**
 * The thirtenth problem in the HS programming constest official solution code.
 *
 * @author Dalton Chichester
 * @version 1.0.0
 */
public class ProblemM
{
    public static void main(String[] args)
    {	
        double balance = 20200;
        int passwordAlgorithm;
        String password;
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsNumber = false;
        boolean containsSpecial = false;
        double withdrawalAmount;
        double fee;
    	Scanner scnr = new Scanner(System.in);

		passwordAlgorithm = scnr.nextInt();
        scnr.nextLine();

        password = scnr.nextLine();

        String withdrawalAmountTemp = scnr.nextLine();
        withdrawalAmountTemp = withdrawalAmountTemp.replace("$", "");
        withdrawalAmountTemp = withdrawalAmountTemp.replace(",", "");
        withdrawalAmount = Double.parseDouble(withdrawalAmountTemp);

        fee = scnr.nextDouble();
        scnr.nextLine();

        if(passwordAlgorithm == 1)
        {
            for(int i = 0; i < password.length(); i++)
            {
                if(Character.isDigit(password.charAt(i)))
                {
                    System.out.println("Invalid password.");
                    System.exit(0);
                }
                else if(!Character.isLetter(password.charAt(i)))
                {
                    System.out.println("Invalid password.");
                    System.exit(0);
                }

                if(((balance - withdrawalAmount) - fee) < 0)
                {
                    System.out.println("Not enough funds in the account.");
                    System.exit(0);
                }
                else
                {
                    balance = ((balance - withdrawalAmount) - fee);

                    System.out.printf("Successful withdrawal. Account balance is $%,.2f.\n", balance);
                    System.exit(0);
                }
            }
        }
        else if(passwordAlgorithm == 2)
        {
            if(password.length() < 12)
            {
                System.out.println("Invalid password.");
                System.exit(0);
            }
            for(int i = 0; i < password.length(); i++)
            {
                if(Character.isDigit(password.charAt(i)))
                {
                    containsNumber = true;
                }
                else if(Character.isLetter(password.charAt(i)))
                {
                    if(Character.isUpperCase(password.charAt(i)))
                    {
                        containsUppercase = true;
                    }
                    else if(Character.isLowerCase(password.charAt(i)))
                    {
                        containsLowercase = true;
                    }
                }
                else if(password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' ||
                    password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '(' || password.charAt(i) == ')' ||
                    password.charAt(i) == '_' || password.charAt(i) == '-' || password.charAt(i) == '+')
                {
                    containsSpecial = true;
                }
            }
            if(containsNumber && containsUppercase && containsLowercase && containsSpecial)
            {
                if(((balance - withdrawalAmount) - fee) < 0)
                {
                    System.out.println("Not enough funds in the account.");
                    System.exit(0);
                }
                else
                {
                    balance = ((balance - withdrawalAmount) - fee);

                    System.out.printf("Successful withdrawal. Account balance is $%,.2f.\n", balance);
                    System.exit(0);
                }
            }
            else
            {
                System.out.println("Invalid password.");
                System.exit(0);
            }
        }
        else if(passwordAlgorithm == 3)
        {
            if(password.length() < 16)
            {
                System.out.println("Invalid password.");
                System.exit(0);
            }

            for(int i = 1; i < password.length(); i += 2)
            {
                if(Character.isLetter(password.charAt(i-1)))
                {
                    if(Character.isLetter(password.charAt(i)))
                    {
                        System.out.println("Invalid password.");
                        System.exit(0);
                    }
                }
                else if(password.charAt(i-1) == '!' || password.charAt(i-1) == '@' || password.charAt(i-1) == '#' || password.charAt(i-1) == '$' || password.charAt(i-1) == '%' ||
                    password.charAt(i-1) == '^' || password.charAt(i-1) == '&' || password.charAt(i-1) == '*' || password.charAt(i-1) == '(' || password.charAt(i-1) == ')' ||
                    password.charAt(i-1) == '_' || password.charAt(i-1) == '-' || password.charAt(i-1) == '+')
                {
                    if(password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' ||
                    password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '(' || password.charAt(i) == ')' ||
                    password.charAt(i) == '_' || password.charAt(i) == '-' || password.charAt(i) == '+')
                    {
                        System.out.println("Invalid password.");
                        System.exit(0);
                    }
                }
            }

            if(((balance - withdrawalAmount) - fee) < 0)
            {
                System.out.println("Not enough funds in the account.");
                System.exit(0);
            }
            else
            {
                balance = ((balance - withdrawalAmount) - fee);

                System.out.printf("Successful withdrawal. Account balance is $%,.2f.\n", balance);
                System.exit(0);
            }
        }
    }
}