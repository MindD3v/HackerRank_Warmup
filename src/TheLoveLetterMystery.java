import java.util.Scanner;

public class TheLoveLetterMystery {

    public static void TheLoveLetterMystery(String[] args) { //change name for main
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();
        String[] tests = new String[numberOfTests];

        for(int i = 0; i < numberOfTests; i++)
        {
            tests[i] = in.next();
        }

        for(int j=0; j< numberOfTests;j++)
        {
            int restult = split(tests[j]);
            System.out.println(restult);
        }
    }

    private static int split(String test1) {
        if(test1.length() >= 2)
            return split(test1,0,test1.length()-1);
        else
            return 0;
    }

    private static int split(String test1, int x, int y) {
        if(x < test1.length()/2){
            char first = test1.charAt(x);
            char last = test1.charAt(y);

            return split(test1, x+1, y-1)+ Math.abs(last - first);
        }else{
            return 0;
        }
    }
}