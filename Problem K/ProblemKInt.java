import java.io.*;
import java.util.*;

/**
 * The eleventh problem in the HS programming constest official solution code.
 */
public class ProblemKInt {
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);

        int pairs = Integer.parseInt(in.nextLine());

        for(int i = 0; i < pairs; i++) {
            int mph   = Integer.parseInt(in.nextLine());
            int miles = Integer.parseInt(in.nextLine());
            int hours = miles / mph;
            int min = ((miles % mph) * 60) / mph;
            int sec = ((miles % mph) * 60) % mph * 60  / mph;
            System.out.printf("Jaffy can bike the trail in %d hours, %d minutes, %d seconds.\n", hours, min, sec);
        }

    }
}
