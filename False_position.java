import java.util.*;
public class False_position {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double x0,x1,x2,f0,f1,f2,n,i = 0.00;
        do
        {
            System.out.println("Enter X1 and X2 : ");
            x1 = s.nextDouble();
            x2 = s.nextDouble();
            f1 = Math.pow(x1, 2) - 4*x1 - 10;
            f2 = Math.pow(x2, 2) - 4*x2 - 10;
            if((f1 * f2) > 0)
            {
                i = 1.00;
            }else i = 2.00;
        }while( i == 1.00);
        do
        {
            x0  =  (x1 + x2)/2;
            //x0 = x1 -((f1)*(x2-x1)/(f2 -f1));
            f0 = Math.pow(x0, 2) - 4*x0 - 10;
            if(f0 == 0)
            {
                System.out.println("Root : "+x0);
                break;
            }
            else
            {
                if((f1 * f0) < 0)
                {
                    x2 = x0;
                }else {x1 = x0;}
                if(Math.abs((x2-x1)/x2) < 0.001)
                {
                    x0  =  (x1 + x2)/2;
                   // x0 = x1 -((f1)*(x2-x1)/(f2 -f1));
                    //System.out.println("Root : "+ x0);
                    break;
                }
            }
            
        }while(Math.abs((x2-x1)/x2) > 0.001);
       System.out.println("Root : "+ x0); 
    }
}
