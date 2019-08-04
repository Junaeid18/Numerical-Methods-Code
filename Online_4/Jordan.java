
package Online_4;

public class Jordan {
    double[][] a; 
    Jordan(double[][] b)
    {
        a = b;
    }
    void result()
    {
        int sc = 0;
        for(int row = 0 ; row < a.length; row++)
        {
            while(a[row][sc] == 0)
            {
                boolean s = false;
                int i = row;
                while(!s && i<a.length)
                {
                    if(a[i][sc] != 0)
                    {
                        double[] temp = a[i];
                        a[i] = a[row];
                        a[row] = temp;
                        s = true;
                    }
                    i++;
                }
            if (a[row][sc]==0.0) {
                    sc++;
                }    
            }
            if(a[row][sc] != 1.00)
            {
                double div = a[row][sc];
                for(int i = sc; i < a[row].length ; i++)
                {
                    a[row][i] = a[row][i] / div;
                }
            }
            for(int i = 0 ; i < a.length; i++)
            {
                if(i != row && a[i][sc] != 0)
                {
                    double mul = 0 - a[i][sc];
                    for(int j = sc ; j < a[row].length ; j++)
                    {
                        a[i][j] += mul * a[row][j];
                    }
                }
            }
            sc++;
        }
    }
    void show()
    {
        for(int i = 0 ; i < a.length ; i++)
            System.out.println(a[i][3]);
    }
}
