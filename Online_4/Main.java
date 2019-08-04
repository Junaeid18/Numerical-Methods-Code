
package Online_4;

public class Main {
    public static void main(String[] args)
    {
        Gauss g = new Gauss();
        int n = 2;
        double[][] a = {
            {3,6,1},
            {2,4,3},
            {1,3,2}
        };
        double[] b = {16,13,9}; 
        double[] x = g.rs(a,b,n);
        for(int i = 0; i <= n ; i++)
        {
            double c = x[i];
            System.out.printf("%.1f\n",x[i]);
        }
    }
}
