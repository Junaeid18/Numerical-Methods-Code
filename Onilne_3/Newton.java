
package Onilne_3;
import java.util.Scanner;
public class Newton {
    public static void main(String[] main)
    {
        double e = 0.001;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of polynimials,N : ");
        int n = s.nextInt();
        double ar[] = new double[n+1];
        System.out.println("Enter co-offieient of polynomial : ");
        for(int a = 0 ; a <= n ; a++ )
        {
            ar[a] = s.nextInt();
        }
        System.out.println("Enter value of initial guess : ");
        double x0 = s.nextDouble();
        for(int i = n ; i >= 1 ; i--)
        {
            newton(n,ar,x0);
            
        }
        
    }
    public static void newton(int n ,double ar[],double x0)
    {
        
    }
}
