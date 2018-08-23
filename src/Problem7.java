import java.util.ArrayList;
import java.util.List;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem7 {
    int cap;
    List<Integer> list;

    public Problem7(int cap) {
        list = new ArrayList<>(cap);
        list.add(2);
        int i = 3;

        while (list.size() < cap){
            boolean isPrime = true;
            for (Integer aList : list) {

                if (i % aList == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                list.add(i);
            }
            i++;
        }
    }


    public static void main(String[] args) {
        Problem7 p7 = new Problem7(10_001);
        for (int i : p7.list) {
            System.out.println(i);
        }
    }
}
