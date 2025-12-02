public class Task2J {

    public static void main(String[] args) {
        System.out.println("5 is prime: " + isPrime(5));
        System.out.println("12 is prime: " + isPrime(12));
        System.out.println("37 is prime: " + isPrime(37));
    }

    // Check if number is prime
    private static boolean isPrime(int n) {
        if (n < 2) return false;   // 0,1 not prime

        for (int i = 2; i * i <= n; i++) { // check divisors
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}