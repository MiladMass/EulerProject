/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2 {

    public int fibonacci() {
        int n1 = 1; // first fibonacci number
        int n2 = 2; // second fibonacci number
        int current; // current fibonacci number
        int sum = n2; // current sum of even fibonacci numbers

        while (true) {
            current = n2 + n1; // calculate next fib number
            if (current > 4_000_000){
                break; // break out if the number is more than the limit;
            }
            if (current % 2 == 0){ // if the current number is even
                sum += current;
            }
            n1 = n2;
            n2 = current;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("p2 = " + new Problem2().fibonacci());
    }

}