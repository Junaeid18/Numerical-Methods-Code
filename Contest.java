
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;

public class Contest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s,q;
        s = sc.next();
        int a = s.length();
        if( a > 50)
            s = s.substring(0, 50);
        String d = s.replaceAll("[^0-9]","");
        System.out.println("size"+a);
        int b = d.length();
        int min = 0;
        for(int i = 0 ; i < a; i++)
        {
            char c = s.charAt(i);
            if(c == 'a'|| c == 'e' ||c == 'i' || c == 'o' || c == 'u')
            {
                min++;
            }
        }
        for(int j = 0 ; j < b ;j++)
        {
            int c = d.charAt(j);
            c = c - 48;
            if(c%2 == 0)
                min++;
        }
        System.out.println(min);
    }
}
