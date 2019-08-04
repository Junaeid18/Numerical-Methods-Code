
package last.numeric;

import java.util.Scanner;

public class Lagrange {
    public static void main(String[] args)
    {
        int n ;
        double[] x,f;
        double mul,a,sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of data points: ");
        n = s.nextInt();
        x = new double[n];
        f = new double[n];
        System.out.println("Enter Data points X(I) and Function values F[I): ");
        for(int b  = 0 ; b < n; b++)
        {
            x[b] = s.nextDouble();
            f[b] = s.nextDouble();
        }
        System.out.println("Enter value of required(a): ");
        a = s.nextDouble();
        for(int i = 0 ;i < n ; i++)
        {
            mul = 1.0;
            for(int j = 0 ; j < n ; j++)
            {
                if(j != i)
                {
                    mul *= (a - x[j])/(x[i]-x[j]);
                }
            }
            sum += mul * f[i];
        }
        System.out.println("The value at: "+a+"is : "+sum);
    }
}
