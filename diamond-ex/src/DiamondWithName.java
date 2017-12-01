import java.util.Scanner;

public class DiamondWithName {
    public static void main(String args[]) {
        int n;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();

        int numberOfCentreLineStars = 2*n - 1;
        int space = numberOfCentreLineStars/2;

        for(int i=1; i<=n-1; i++, space--) {

            // Spaces
            for(int j=0; j<space; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<2*i-1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        System.out.print("Karuppiah\n");

        space = 1;

        for(int i=n-1; i>=1; i--, space++) {

            // Spaces
            for(int j=0; j<space; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<2*i-1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
