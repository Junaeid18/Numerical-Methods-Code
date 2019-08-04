import java.util.*;
public class Bisection_Method {
    public static void main(String[] args)
    {
        double x0,x1,x2,e,root,f0,f1,f2;
        e = 0.001;
        do{
        System.out.println("Enter X1  and X2 : ");
        Scanner s = new Scanner(System.in);
        x1 = s.nextDouble();
        x2 = s.nextDouble();
        root = Method(x1,x2);
        }while(root == 1.00);
        x0 = (x1 + x2)/2;
        f0 = Root(x0);
        if(f0 == 0)
        {
            System.out.println("Root : "+ x0);
        }
        //else if()
    }
    public static double Method(double a,double b)
    {
        double f1,f2,n,i,r;
        n = a;
        i = b;
        f1 = Math.pow(n,2) - 4*n -10;
        f2 = Math.pow(i, 2)-4*n-10;
        if((f1 * f2) > 0){
            r = 1.00;
            return r;
        }
        else{
            r = 5.00;
            return r;
        }
    }
    public static double Root(double s)
    {
        double f0,n;
        n = s;
        f0 = Math.pow(n, 2) - 4*n -10;
        return f0;
    }
}
