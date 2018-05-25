import java.time.chrono.IsoChronology;

/**
 * CouponCollector
 */
public class CouponCollector {

    public static void main(String[] args) {
        // Generate random values in [0..n) until we find each one
        int n = Integer.parseInt(args[0]);
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;

        while(distinct < n) {
            // Generate another coupon
            int r = (int) (Math.random() * n);
            count++;
            if (!isCollected[r]) {
                distinct++;
                isCollected[r] = true;
            }
        }
        // n distinct coupons found.
        System.out.printf("%s %-2d %s %-2d \n","count: ", count, " distinct: ", distinct);
    }
}