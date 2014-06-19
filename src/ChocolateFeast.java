import java.util.Scanner;

public class ChocolateFeast {

    public static void ChocolateFeast(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int n, int c, int m){
        if(n > 2)
        {
            int chocolateBought = n/c;
            int chocolateWrapper = chocolateBought;

            while(chocolateWrapper > 0 && chocolateWrapper >= m)
            {
                int newChocolate = chocolateWrapper / m;
                chocolateBought += newChocolate;
                chocolateWrapper -= m * newChocolate;
                chocolateWrapper = chocolateWrapper + newChocolate;
            }

            return chocolateBought;
        }
        return 0;
    }
}
