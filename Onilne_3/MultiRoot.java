
package Onilne_3;

import java.util.Scanner;
public class MultiRoot {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of polynimials,N : ");
        int n = s.nextInt();
        int ar[] = new int[n+1];
        System.out.println("Enter co-offieient of polynomial : ");
        for(int a = 0 ; a <= n ; a++ )
        {
            ar[a] = s.nextInt();
        }
        System.out.println("Enter valuf of a & b : ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double x1,x2,f1,f2,f0,x0,root;
        System.out.println("Enter the Size of Incremental X");
        double x3 = s.nextDouble();
        System.out.println("Enter Error Criterion: ");
        double e = s.nextDouble();
        int i = 0;
        while(i == 0)
        {
            x1 = a ;
            x2 = a + x3 ;
            f1 = function(ar,n-1,x1);
            f2 = function(ar,n-1,x2);
            System.out.println("Ok");
            if((f1 * f2) > 0 )
                System.out.println("No root In this interval");
            else
            {
                System.out.println("Kaj hocce");
                int j = 1;
                do
                {
                x0  = (x1+x2)/2;
                f0 = function(ar,n-1,x0);
                    System.out.println("Result : "+f0);
                if(f0 == 0.00){
                    System.out.println("Root : "+x0);
                    break;
                }
                else if(f1 *f2 < 0)
                {
                    x2 = x0;
                }
                else
                {
                    x1 = x0;
                    f1 = f0;
                }
                if(Math.abs((x2-x1)/x2) < e)
                {
                   root = (x1+x2)/2;
                    System.out.println("Root: "+ root);
                    j = 2;
                }
               }while( j == 1);
            }
            if(x2 < b)
            {
                a = x2;
            }
            else i = 5;
        }
    }
    public static double function(int ar[],int n,double x)
    {
        double f = ar[n+1];
        for(int b = n ; b >= 0; b--)
        {
            f = f * x + ar[b];
        }
        return f;
    }
}
