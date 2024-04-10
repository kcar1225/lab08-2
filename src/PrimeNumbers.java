public class PrimeNumbers {
    static boolean isPrime(int n) {  //method to check if number is prime
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    static boolean threeDigits(int num) { //method to check if number has three digits
        while (num > 0) {
            if (num % 10 == 3) {
                return true;
            }
            num /= 10;
        }
        return false;
    }




















}
