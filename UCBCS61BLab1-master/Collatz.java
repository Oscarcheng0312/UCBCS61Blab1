/** Class that prints the Collatz sequence starting from a given number.
 *  Oscar Cheng YOUR NAME HERE
 */
public class Collatz {

    /** the function is called Collatz sequence if n is odd, return 3n+1 else return n/2 */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n/2;
        } else {
            return 3 * n + 1;
        }
    }

    /** main function for our Collatz sequence */
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
            while(n > 1){
                System.out.println(nextNumber(n));
                n = nextNumber(n);

        }
    }

}

