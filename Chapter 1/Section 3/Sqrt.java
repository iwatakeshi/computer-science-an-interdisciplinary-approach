/**
 * Sqrt
 */
public class Sqrt {

    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double EPSILON = 1e-15;
        double t = c;
        while (Math.abs(t - c /t) > EPSILON * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println(t);
    }
}