import java.util.Scanner;

public class ArrayInput2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t -- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for(int j = 0; j<m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int res = arr[0][0];
            System.out.println(res);

        }
    }
}
