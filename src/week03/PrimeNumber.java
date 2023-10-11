package week03;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
    }

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
