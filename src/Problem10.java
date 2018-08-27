import java.util.Arrays;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */
public class Problem10 {
    private int cap; // the maximum number, all prime numbers will bellow this

    public Problem10(int cap) {
        this.cap = cap;
        boolean[] list = new boolean[cap];
        Arrays.fill(list, true);
        list[0] = false; // 0 is not a prime number
        list[1] = false; // also one is note a prime

        for (int i = 2; i < cap; i++) { // loop through the entire numbers
            if (list[i]) { // if the index is still set to be a prime number
                int j = 2; //from the second multiplication onwards
                int nonPrime;
                while ((nonPrime = i * j) < cap) {
                    list[nonPrime] = false; // set to not prime, this will set all the numbers that are multiplications of the i to false
                    j++;
                }

            }
        }

        long sum = 0; // sum of all the prime numbers

        for (int i = 0; i < cap; i++) { // loop through and get all the prime numbers
            if (list[i]) {
                sum += i;
            }
        }


        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Problem10(2_000_000);
    }
}
