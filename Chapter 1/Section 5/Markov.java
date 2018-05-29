/**
 * Markov
 * Program 1.6.3
 * Mixing a Markov chain
 */
public class Markov {
  public static void main(String[] args) {
    // Compute page ranks after trials moves.
    int trials = Integer.parseInt(args[0]);
    int n = StdIn.readInt();
    StdIn.readInt();

    // Read transition matrix.
    double [][] p = new double[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        p[i][j] = StdIn.readDouble();
      }
    }

    // Use the power method to compute page ranks.
    double[] ranks = new double[n];
    ranks[0] = 1.0;
    for (int t = 0; t < trials; t++) {
      // Compute effect of next move on page ranks.
      double[] newRanks = new double[n];
      for (int j = 0; j < n; j++) {
        // New rank of page j is a dot product
        // of old ranks and column j of p[][]
        for (int k = 0; k < n; k++) {
          newRanks[j] += ranks[k] * p[k][j];
        }
      }
      for (int j = 0; j < n; j++) {
        ranks[j] = newRanks[j];
      }
    }

    for (int i = 0; i < n; i++) {
      StdOut.printf("%8.5f", ranks[i]);
    }
    StdOut.println();
  }
}