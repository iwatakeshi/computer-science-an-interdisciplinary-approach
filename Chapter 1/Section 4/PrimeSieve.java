/**
 * PrimeSieve
 */
public class PrimeSieve {

    public static void main(String[] args) {
        // Print the number of primes <= n.
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= n/i; i++) {
            // System.out.println("n/i: " + (n / i));
            if (isPrime[i]) {
                for (int j = i; j < n/i; j++) {
                    isPrime[i * j] = false;
                    System.out.printf("%s %-2d %s %-2d %s %-2d %s %-2d\n", 
                        "i: ", i, " j: ", j, " n / i: ", (int) (n / i), " i * j: ", i * j);
                }
            }
        }

        int primes = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) primes++;
        }
        System.out.println(primes);
    }
}