
package Online2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter degree of polynomial,N :");
        int n = s.nextInt();
        int ar[] = new int[n+1];
        System.out.println("Enter co-efficient of polynomial : ");
        for(int a = 0 ; a <= n;  a++)
        {
            ar[a] = s.nextInt();
        }
        System.out.println("Value of X : ");
        double x = s.nextInt();
        int i = 0;
        do{
            double f1 = function(ar,n-1,x);
            double f2 = 2 * x - 3;
            double x1 = x - (f1/f2);
            System.out.printf("Funtion result : %.2f\n ",x1);
            if(Math.abs((x1 - x)/x1) <= 0.001)
                i = 1;
            else x = x1;
        }while(i == 0);
    }
    public static double function(int ar[],int n,double x)
    {
        double f = ar[n+1];
        for(int i = n ; i >= 0 ; i--)
        {
            f = f * x + ar[i];
            //System.out.println(" f : "+f);
        }
        return f;
    }
}
