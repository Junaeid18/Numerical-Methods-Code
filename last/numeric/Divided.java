
package last.numeric;

import java.util.Scanner;

public class Divided {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n,i,j = 1;
        double f,f1,f2 = 0,k;
        double[] x,y,p;
        System.out.println("Enter number of observation : ");
        n = s.nextInt();
        x = new double[n];
        y = new double[n];
        p = new double[n];
        System.out.println("Enter value of x and y : ");
        for(i = 0 ; i < n ; i++)
        {
            x[i] = s.nextDouble();
            y[i] = s.nextDouble();
        }
        f = y[0];
        System.out.println("Enter the value you want to evaluate :");
        k = s.nextDouble();
        do{
            for(i = 0; i < n-1 ; i++)
            {
               p[i] = ((y[i+1]- y[i]) / (x[i+j]-x[i]));
               y[i] = p[i];
            }
            f1 = 1;
            for(i = 0; i < j ;i++)
            {
                f1 *= k - x[i];
            }
            f2 += (y[0]*f1);
            n--;
            j++;
        }while(n != 0);
        f += f2;
        System.out.println("Value : "+f);
    }
}
