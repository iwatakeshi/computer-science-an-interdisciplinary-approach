/**
 * RandomSurfer
 * Program 1.6.2
 */
public class RandomSurfer {
  public static void main(String[] args) {
    // Simulate random surfer.
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
    
    int page = 0;
    int[] freq = new int[n];
    for (int t = 0; t < trials; t++) {
      // Make on random move to next page.
      double r = Math.random();
      double sum = 0.0;
      for (int j = 0; j < n; j++) {
        // Find interval containing r.
        sum += p[page][j];
        if (r < sum) {
          page = j;
          break;
        }
      }
      freq[page]++;
    }

    for (int i = 0; i < n; i++) {
      // Print page ranks
      StdOut.printf("%8.5f", (double) freq[i] / trials);
    }
    StdOut.println();
  }
}