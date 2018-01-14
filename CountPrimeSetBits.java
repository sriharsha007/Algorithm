package Algorithm;

public class CountPrimeSetBits {

    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(842, 888));
    }

    //function to count prime set bits
    public static int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i <= R; i ++) {
            int count = countSetBits(i);
            if(isPrime(count)) {
                result ++;
            }
        }
        return result;
    }

    //function to count set bits in an integer
    public static int countSetBits(int n) {
        int c = 0;
        while (n > 0) {
            c += n & 1;
            n >>= 1;
        }
        return c;
    }

    //function to check whether a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
