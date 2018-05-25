/**
 * Factors
 */
public class Factors {

    public static void main(String[] args) {
        // Print the prime factorization of n.
        long n = Long.parseLong(args[0]);
        for(long factor = 2; factor <= n/factor; factor++) {
            System.out.printf("%s %-10d %s %-10d %s %-2d\n", "factor: ", factor, " n: ", n, " n / factor: ", (int) (n / factor));
            while (n % factor == 0) {
                // Cast out and print factor.
                n /= factor;
                // System.out.print(factor + " ");
            }
            // Any factor of n must be greater than factor.
        }
        // if (n > 1) System.out.print(n);
        // System.out.println();
    }
}