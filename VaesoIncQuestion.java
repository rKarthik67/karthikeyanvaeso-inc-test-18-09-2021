import java.util.Arrays;
import java.util.Scanner;

public class VaesoIncQuestion {

    static int minDiff(int cost[], int N, int M)
    {
        int res = Integer.MAX_VALUE;
        Arrays.sort(cost);
        for (int i=0; i<= N-M;i++) 
        {
            res = Math.min(res, cost[i + M - 1] - cost[i]);
        }
        return res;
    }

    static int requiredelements(int res,int cost[], int N, int M)
    {
        int res1 = Integer.MAX_VALUE;
        for(int i=0; i<=N; i++)
        {
            res1 = Math.min(res1, cost[i + M - 1] - cost[i]);
            if (res1==res1) 
            {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int cost[] = {7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
        String items[] = { "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
        int N = cost.length;
        
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        
        int req = minDiff(cost, N, M);
        
        System.out.println("Number of the employees:"+M);
        System.out.println(" ");
        int startpos = requiredelements(req,cost,N,M);
        System.out.println("Here the goodies that are selected for distribution are:");
        for(int i = startpos;i<startpos+M;i++) 
        {
            System.out.println(items[i]);
        }
        System.out.println(" ");
        System.out.println("And the difference between the chosen goodies with highest price and the lowest price is:"+req);
    }
}

    