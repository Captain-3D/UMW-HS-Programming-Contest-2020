import java.io.*;
import java.util.*;

/**
 * The fourteenth problem in the HS programming constest official solution code.
 */
public class ProblemNSort {
    private static class Guest {
        String name;
        int temp;
        int hours;
        int minutes;
        int totTime;
        String getName() { return name; }     // needed for compareByTimeName
        int getTotTime() { return totTime; }  // needed for compareByTimeName
    }

    public static void main(String[] args) {	
        ArrayList<Guest> guests = new ArrayList<>();
        ArrayList<Guest> happyGuests = new ArrayList<>();
        ArrayList<Guest> unhappyGuests = new ArrayList<>();
    	Scanner in = new Scanner(System.in);

        String stringBuffer = in.nextLine();
        while(!stringBuffer.equals(".")) {
            String [] guestBuffer = stringBuffer.split("\\s");
            Guest g = new Guest();
            g.name = guestBuffer[0];
            g.temp = Integer.parseInt(guestBuffer[1]);
            guests.add(g);
            stringBuffer = in.nextLine();
        }
        int weddingDayTemp = Integer.parseInt(in.nextLine());

        for(Guest g : guests)
            if(g.temp <= weddingDayTemp && g.temp >= 40) {
                g.totTime = (g.temp - 40) * 2; // diff in half degrees
                g.hours = g.totTime / 60;
                g.minutes = g.totTime % 60;
                g.totTime = -g.totTime; // negate totTime to sort descending
                happyGuests.add(g);
            }
            else
                unhappyGuests.add(g);

        Comparator<Guest> compareByTimeName = Comparator.comparing(Guest::getTotTime).thenComparing(Guest::getName);
        Collections.sort(happyGuests, compareByTimeName);

        for(Guest g : happyGuests)
            if(g.totTime == 0)
                System.out.println(g.name + ": Remove bottle from fridge at the time of the wedding.");
            else {
                String hrs = g.hours == 1 ? " hour" : " hours";
                String mins = g.minutes == 1 ? " minute" : " minutes";
                System.out.println(g.name + ": Remove bottle from fridge " + g.hours + hrs + " and " + g.minutes + mins + " before the wedding.");
            }

        for(Guest g : unhappyGuests)
            System.out.println(g.name + ": Unable to get the right temperature.");
    }
}


