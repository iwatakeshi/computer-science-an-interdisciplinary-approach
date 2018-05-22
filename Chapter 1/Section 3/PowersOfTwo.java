/**
 * PowersOfTwo
 */
public class PowersOfTwo {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // int power = 2;
        int i = 0;
        // while(i <= n) {
        //     System.out.println(i + " " + power);
        //     power = 2 * power;
        //     i = i + 1;
        // }
        
        
        // With limit (version 1)
        int power = 1;
        while(power < n/2) {
            power *= 2;
            System.out.println(power);
        }

        // With limit (version 2)
        
        // int power = 2;
        // while (power < n) {
        //     System.out.println(power);
        //     power = 2*power;
        // }
        
    }
}