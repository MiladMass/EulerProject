/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    private long num;

    public Problem3(long num) {
        this.num = num;
    }

    public long largestPrimeFactor() {
        long largestPrime = -1; // max prime number


        while (num % 2 == 0) { // if the number is is even
            largestPrime = 2; // set the largest prime number to 2
            num /= 2; //and divide the number by 2
        }

        for (int i = 3; i < Math.sqrt(num); i += 2) { // when done,
            while (num % i == 0) { // for whatever number of the next numbers
                num /= i;// divide the num to those
            }
        }

        if (num > 2)
            largestPrime = num; // not the largest number is outputted

        return largestPrime;

    }

    public static void main(String[] args) {
        System.out.println("p3 = " + new Problem3(600851475143L).largestPrimeFactor());
    }



}
