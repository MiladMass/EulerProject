/**
 * The sum of the squares of the first ten natural numbers is,
 *
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {
    int count;

    public Problem6(int count) {
        this.count = count;

        long sumOfSquare = 0;
        long squareOfSum = 0;
        for (int i = 1; i <= count; i++) {
            sumOfSquare += Math.pow(i, 2);
        }
        for (int i = 1; i <= count; i++) {
            squareOfSum += i;
        }
        squareOfSum = (long) Math.pow(squareOfSum, 2);



        System.out.println(squareOfSum - sumOfSquare);
    }


    public static void main(String[] args) {
        System.out.print("p6 = ");
        new Problem6(100);
    }
}
