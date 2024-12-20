import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t -- > 0) {
            String s = sc.next();

            String res = s;
            System.out.println(res);

        }
    }
}
