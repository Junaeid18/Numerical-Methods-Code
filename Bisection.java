import java.util.*;
public class Bisection {
    public static void main(String[] args)
    {
        double x0,x1,x2,f0,f1,f2,f3,n,p;
        int i = 0,r = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Enter X1 and X2 : ");
            x1 = s.nextDouble();
            x2 = s.nextDouble();
            f1 = Math.pow(x1, 2) -4 *x1- 10 ; 
            f2 = Math.pow(x2, 2) -4* x2 - 10 ; 
            if((f1 * f2) > 0 )
            {
                r = 1;
            }else r = 2; 
        }while(r == 1);
        do
        {
        x0 = (x1 +x2)/2;
        f0  = Math.pow(x0, 2) - 4 *x0 -10 ;
        if(f0 == 0.00)
        {
            System.out.println("Root : "+ x0);
            break;
        }
        else
        {
          if((f1 * f0) < 0)
          {
               x2 = x0;
          }       
          else
          {
            x1 = x0;
          }
          System.out.println("x1 "+x1+" x2 "+x2);
          double w = Math.abs((x2 -x1)/x2);
         // System.out.println("Ans : " +w);
          if(Math.abs((x2 - x1)/x2) < 0.001)
          {
            x0  =  (x1 + x2)/2;
            break;
          }
        }
       // System.out.println("Doing work");
        }while(Math.abs((x2 -x1)/x2) > 0.001);
        System.out.println("Root : " + x0);
    
    }
}
