package arr;
import static java.lang.System.out;
public class L15 {
    public static void main(String[] args) {
       // int [] m = new int[3];

/*        m[0] = 7;
        m[1] = 8;
        m[2] = 3;*/
//int[] m = {5, 10, 3, 4};
//String [] names = new String[3];
        int [][] matrix =
                {
                        {1,2,3},
                        {3,4,5}
                };
        for(int i=0; i<matrix.length; i++)
        {
for (int j = 0; j < matrix[i].length; j++)
    out.printf("%3d", matrix[i][j]);
out.println();

        }
           // m[i] *=2;
       // for(int i=0; i< m.length; i++)
         //   out.println(m[i]);



    }
}
