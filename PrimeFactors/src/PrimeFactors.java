import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {

    private static int findFactorPower(double number, int prime) {

        int power = 1;

        while(number % Math.pow(prime, power) == 0) {
            power++;
        }

        return power-1;
    }

    private static boolean isPrime(double n) {

        if(n == 1) {
            return false;
        } else if(n == 2) {
            return true;
        } else if (n%2 ==  0) {
            return false;
        }

        for(int i=3; i<=Math.sqrt(n); i+=2) {
            if(n%i == 0) {
                return false;
            }
        }

        return true;

    }

    private static ArrayList<Integer> generate(int n) {

        ArrayList<Integer> primeFactors = new ArrayList<>();

        int m = n;

        if(m%2 == 0) {
            primeFactors.add(2);

            int power = findFactorPower(m, 2);

            m = m / (int) Math.pow(2, power);
        }

        int i;

        for(i=3; m!=1; i+=2) {
            if(m%i == 0) {
               if(isPrime(i)) {
                   primeFactors.add(i);

                   int power = findFactorPower(m, i);

                   m = m / (int) Math.pow(i, power);
               }
            }
        }

        return primeFactors;
    }

    public static void main(String args[]) {
        int n;

        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();

        System.out.print(generate(n));
    }
}
