
package Online_4;

public class MathDriver {
    public static void main(String[] args) {
        double[][] array1 = {
            //{2,4,-2,2},
            //{4,9,-3,8},
            //{-2,-3,7,10}
            {2,4,-6,-8},{1,3,1,10},{2,-4,-2,-12}
        };
        Jordan example = new Jordan(array1);
        /*example.eliminate();
        System.out.println(example);
    */
        example.result();
        example.show();
    }
}
