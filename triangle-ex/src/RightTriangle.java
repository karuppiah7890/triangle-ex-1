import java.util.Scanner;

public class RightTriangle {
    public static void main(String args[]) {
        int n;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
