/**
 * Transition
 * Program 1.6.1
 * Computing the transition matrix
 */
public class Transition {
  public static void main(String[] args) {
    int n = StdIn.readInt();
    int[][] counts = new int[n][n];
    int[] outDegrees = new int[n];
    while(!StdIn.isEmpty()) {
      // Accumulate link counts.
      int i = StdIn.readInt();
      int j = StdIn.readInt();
      outDegrees[i]++;
      counts[i][j]++;
    }
    StdOut.println(n + " " + n);
    for (int i = 0; i < n; i++) {
      // Print probability distribution for row i.
      for(int j = 0; j < n; j++) {
        // Print probability distribution for column j.
        double p = 0.9 * counts[i][j] / outDegrees[i] + 0.1 / n;
        StdOut.printf("%8.5f", p);
      }
      StdOut.println();
    }
  }
}