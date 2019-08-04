import java.util.Vector;
public class Vector_demo {
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<Integer>();
        v.add(10);
        v.add(60);
        v.add(70);
        v.add(96);
        v.add(65);
        v.add(41);
        for(int i :v)
        {
            System.out.println("Element : "+ i);
        }
    }
}
