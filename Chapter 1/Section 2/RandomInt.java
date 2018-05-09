/**
 * RandomInt
 */
public class RandomInt {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    double r = Math.random();
    int value = (int) (r * n);
    System.out.println("r: " + r);
    System.out.println(value);
  }
}