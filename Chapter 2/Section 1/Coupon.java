/**
 * Coupon
 * Program 2.1.3
 * Coupon collector (revisited)
 */
public class Coupon {
    
    public static int getCoupon(int n) {
        // Return a random integer between 0 and n - 1.
        return (int) (Math.random() * n);
    }

    public static int collectCoupons(int n) {
        // Collect coupons until getting one of each value
        // and return the number of coupons collected.
        boolean[] isCollected = new boolean[n];
        int count = 0, distinct = 0;
        while (distinct < n) {
            int r = getCoupon(n);
            count++;
            if (!isCollected[r]) {
                distinct++;
            }
            isCollected[r] = true;
        }
        return count;
    }
    
    public static void main(String[] args) {
        // Collect n different coupons.
        int n = Integer.parseInt(args[0]);
        int count = collectCoupons(n);
        StdOut.println(count);
    }    
}