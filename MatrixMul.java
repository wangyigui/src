/**
 * Created by Snoopy on 2016/11/8.
 */
public class MatrixMul {
    public static void main(String args[]) {
        int i, j, k;
        int a[][] = new int[2][3];
        int b[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int c[][] = new int[2][4];
        for (i = 0; i < 2; i++)
            for (j = 0; j < 3; j++)
                a[i][j] = (i + 1) * (j + 1);
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 4; j++) {

                c[i][j] = 0;
                for (k = 0; k < 3; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
        System.out.println("***Matrix A***");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();

        }
        System.out.println("\n***Matrix  B***");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
        System.out.println("\n***Matrix C***");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
