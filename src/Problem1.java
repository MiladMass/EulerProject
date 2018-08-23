/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

    private int max; //indicate a max limit for calculation

    public Problem1(int max) {
        this.max = max;
    }


    public int calculate() {
        int sum = 0;
        for (int i = 0; i < max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("p1 = " + new Problem1(1000).calculate());
    }
}
