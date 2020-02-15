import java.util.Scanner;

/**
 * The fifth problem in the HS programming constest official solution code.
 */
public class ProblemESimple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numLines = Integer.parseInt(in.nextLine());
        double total = Integer.parseInt(in.nextLine());
        for(int i = 1; i < numLines; i+=2) {
            String op = in.nextLine();
            int operand = Integer.parseInt(in.nextLine());
            if(op.equals("+"))
                total = total + operand;
            else if(op.equals("-"))
                total = total - operand;
            else if(op.equals("*"))
                total = total * operand;
            else if(op.equals("/"))
                total = total / operand;
        }  
        System.out.printf("%.1f\n", total);
    }
}
