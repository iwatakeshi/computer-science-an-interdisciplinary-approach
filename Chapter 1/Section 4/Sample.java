/**
 * Sample
 */
public class Sample {

    public static void main(String[] args) {
        // Print a random number of m integers
        // from 0 ... n - 1 (no duplicates)
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] perm = new int[n];

        // Initialize perm[]
        for(int j = 0; j < n; j++) {
            perm[j] = j;
        }

        // Take sample
        for (int i = 0; i < m; i++) {
            double rndnum = Math.random();
            int r =  i + (int) (rndnum * (n - i));
            System.out.printf("%s %-10f %s %-2d %s %-2d %s %-2d %s %-2d\n","random: ", rndnum, " n: ", n, " i: ", i, " n - i: ", (n - i), " r: ", r);
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }

        // Print sample
        for (int i = 0; i < m; i++) {
            System.out.print(perm[i] + " ");
        }

        System.out.println();
    }
}