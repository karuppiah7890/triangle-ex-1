public class FizzBuzz {
    public static void main(String args[]) {
        int n = 100;
        int tempRem3;
        int tempRem5;

        for(int i=1; i<=n; i++) {

            tempRem3 = i%3;
            tempRem5 = i%5;

            if( tempRem3==0 && tempRem5==0 ) {
                System.out.println("FizzBuzz");
            } else if(tempRem3==0) {
                System.out.println("Fizz");
            } else if(tempRem5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
