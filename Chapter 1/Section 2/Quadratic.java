/**
 * Quadratic
 */
public class Quadratic {
  public static void main(String[] args) {
    double b = Double.parseDouble(args[0]);
    double c = Double.parseDouble(args[1]);
    double discriminent = b * b - 4.0 * c;
    double d = Math.sqrt(discriminent);
    System.out.println((-b + d) / 2);
    System.out.println((-b - d) / 2);
  }
}