import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();
        int[] tests = new int[numberOfTests];

        for(int i = 0; i < numberOfTests; i++)
        {
            tests[i] = in.nextInt();
        }

        for(int i =0; i < numberOfTests; i ++)
        {
            int tree = 1;
            for(int j=1; j <= tests[i];j++)
            {
                if(j%2==0)
                    tree++;
                else
                    tree*=2;
            }
            System.out.println(tree);
        }
    }
}