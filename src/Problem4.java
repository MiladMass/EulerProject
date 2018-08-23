
/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    int numberOfDigits;

    public Problem4(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;

    }


    /**
     * create  biggest n digit numbers based on user input
     *
     * @return n number digit
     */
    private int createBigNumber() {

        if (numberOfDigits <= 0) {
            return -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= numberOfDigits; i++) {
            sb.append(9);
        }
        return Integer.parseInt(sb.toString());
    }

    /**
     * create smallest n digit numbers based on user input
     *
     * @return n number digit
     */
    private int createSmallNumber() {
        if (numberOfDigits <= 0) {
            return -1;
        }
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= numberOfDigits; i++) {
            sb.append("0");
        }
        return Integer.parseInt(sb.toString());
    }


    /**
     * checks if the given number is a palindrome
     *
     * @param number checks this number and decides if it is palindrome
     * @return true if the number is palindrome and false if it is not
     */
    private boolean isPalindrome(int number) {
        String str = Integer.toString(number);// convert the number to string to efficiently check for palindrome
        int i = 0; // start from start
        int j = str.length() - 1; //start from end

        while (i <= j) { // as long as they don't reach each other
            if (str.charAt(i) != str.charAt(j)) { //if they are not the same
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public int calculate() {
        int a = createBigNumber();
        int small = createSmallNumber();
        int max = 0;


        for (; a > small; a--) {
            int b = createBigNumber();
            for (; b > small; b--) {
                int temp = a * b;
                if (isPalindrome(temp)) {
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("p4 = " + new Problem4(3).calculate());
    }
}