import java.text.DecimalFormat;
import java.util.Scanner;

public class HalloweenParty {

    public static void HalloweenParty(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();
        int[] tests = new int[numberOfTests];

        for(int i = 0; i < numberOfTests; i++)
        {
            tests[i] = in.nextInt();
        }

        for(int i =0; i < numberOfTests; i ++)
        {
            double test = tests[i];
            double result = (test - (int)test/2) * (int)(test/2);
            DecimalFormat format = new DecimalFormat("#");
            System.out.println(format.format(result));
        }
    }
}