public class PrimeNumber {
    public static boolean numberPrime(int num){
        boolean isPrime = true;
        int count = 2;

        while(count < num && isPrime == true){
            if(num % count == 0)
                isPrime = false;
            count = count + 1;
        }

        return isPrime;
    }
}
