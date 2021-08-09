package topInterviewQuestions.easy.math.countPrimes;

public class Solution {
    //Space efficient approach

    /* public int countPrimes(int n) {
         int counter = 0;
         for (int i = 2; i < n; i++) {
             if (isPrime(i))
                 counter++;
             if (i >= 3)
                 i++;
         }
         return counter;
     }
         public boolean isPrime(int a) {
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0)
                return false;
        }
        return a >= 2;
    }
 */
    //Time efficient approach
    public int countPrimes(int n) {
        int counter = 0;
        boolean[] compositeNumbers = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (!compositeNumbers[i]) {
                for (int j = i * i; j < n; j += i) {
                    compositeNumbers[j] = true;
                }
            }
        }
        for (int i = 2; i < compositeNumbers.length; i++) {
            if (!compositeNumbers[i])
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(5000000));
    }
}
