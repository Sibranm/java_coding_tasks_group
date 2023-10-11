package week03;

public class IsPrimeNumberSima {
    /*
    1. Numbers -- Prime Number
    Write a method that can check if a number is
    prime or not
     */

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(9));
        System.out.println(isPrime(13));
    }
    public static boolean isPrime(int num){

        if(num == 1){
            return false;
        }

        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;


    }
}
