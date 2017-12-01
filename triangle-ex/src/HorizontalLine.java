import java.util.Scanner;

public class HorizontalLine {
    public static void main(String args[]) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();

        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
    }
}
