
package last.numeric;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class INverse {
    public static void main(String[] args)
    {
        int n ;
        double[] x,y;
        double mul,a,sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of data points: ");
        n = s.nextInt();
        x = new double[n];
        y = new double[n];
        System.out.println("Enter Data points X(I) and Function values F[I): ");
        for(int b  = 0 ; b < n; b++)
        {
            x[b] = s.nextDouble();
            y[b] = s.nextDouble();
        }
        System.out.println("Enter value of Y for X: ");
        a = s.nextDouble();
        for(int i = 0 ;i < n ; i++)
        {
            mul = 1.0;
            for(int j = 0 ; j < n ; j++)
            {
                if(j != i)
                {
                    mul *= (a - y[j])/(y[i]-y[j]);
                }
            }
            sum += mul * x[i];
            //sum = Math.round(sum * 1000000.0)/ 1000000.0;
        }
        System.out.println("The value at: "+a+"is : "+sum);
    }
}
