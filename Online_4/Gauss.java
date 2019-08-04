
package Online_4;

public class Gauss {
    double[] rs(double[][] a,double[] b,int n)
    {
        double factor,pivot,sum;
        for(int k = 0 ; k <= n-1 ; k++)
        {
            pivot = a[k][k];
            System.out.println("Pivot :"+pivot);
            if(pivot == 0.0)
            {
                for(int i = 0 ; i <= n ; i++ )
                {
                    double t = a[k][i];
                    a[k][i] = a[k+1][i];
                    a[k+1][i] = t;
                }
                double t  = b[k]; b[k] = b[k+1]; b[k+1] = t;
                System.out.println("Done"+b[k+1]+" "+b[k]);
                pivot = a[k][k];
            }
            for(int i = k + 1 ; i <= n; i++ )
            {
                factor = a[i][k] /pivot;
                System.out.println("Factor :"+ factor);
                for(int j = k+1 ; j <= n; j++)
                {
                    a[i][j] -= a[k][j]*factor; 
                }
                b[i] -= b[k]*factor;
            }
        }
        double[] x = new double[n+1];
        System.out.println("Val" + a[n][n]);
        x[n] = b[n]/a[n][n];
        for(int k = n-1; k >= 0 ; k--)
        {
            sum = 0.00;
            for(int j = k + 1 ; j <= n ; j++)
            {
                sum = sum + a[k][j] * x[j];
            }
            x[k] = (b[k] - sum)/a[k][k];
            System.out.println("Val"+x[k]);
        }
        return x;
    }
}
