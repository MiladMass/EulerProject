/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 {
    public Problem9() {
        for (int i = 1; i < 1000; i++) { // the three numbers are all initiated from one and each is smaller than the next
            for (int j = i; j < 1000; j++) {
                for (int k = j; k < 1000; k++) {
                    if ((i + j + k) == 1000) { //if the summation is 1000 (order must be maintained since summation takes less processing than power)
                        if ((Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2))) { //  thr rest of the formula shall match
                            System.out.println(i + " " + j + " " + k);
                            System.out.println(i * j * k);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Problem9();
    }

}
