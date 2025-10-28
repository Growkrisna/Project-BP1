//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Minggu7;
public class potd1 {
    public static void main(String[] args) {
        int[] i = {1,1,1,2,2,2};
        int[] j = {1,2,3,1,2,3};

        for (int n = 1; n <= 1 ; n++){
//            System.out.println("i = " + i[n - 1]+", ");

            for ( int nn = 1; nn < 7; nn++){
                System.out.println("i = " + i[nn - 1]+", " +"j = "+ j[nn - 1]+", ");
            }
        }
    }
}