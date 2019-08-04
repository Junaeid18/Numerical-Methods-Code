
package Online2;

import java.util.Scanner;

public class Secant_Method {
    public static void main(String[] args)
    {
        double x1,x2,x3,f1,f2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter degree of polynomial,N :");
        int n = s.nextInt();
        int ar[] = new int[n+1];
        System.out.println("Enter co-efficient of polynomial : ");
        for(int a = 0 ; a <= n;  a++)
        {
            ar[a] = s.nextInt();
        }
        System.out.println("Enter Error criterion , E :");
        double e = s.nextDouble();
        System.out.println(" Enter Value of X1 & X2 : ");
        int i = 0;
            x1 = s.nextDouble();
            x2 = s.nextDouble();
        do{
            f1 = function(ar,n-1,x1);
            System.out.println("f1 : "+f1);
            f2 = function(ar,n-1,x2);
            System.out.println("f2 : "+f2);
            x3 = x2 - (  (f2*(x2-x1))  / (f2 -f1) );
            System.out.println("x3 : "+x3);
            double b = Math.abs((x3-x2)/x3);
            //System.out.printf("Value  : %.2f \n",b);
            if(Math.abs((x3-x2)/x3) < e)
                i  = 1;
            else
            {
                x1 = x2 ;
                x2 = x3 ;
            }
        }while(i == 0);
        System.out.println("Root : "+ x3);
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
