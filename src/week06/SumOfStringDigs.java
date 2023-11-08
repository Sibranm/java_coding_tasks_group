package week06;

public class SumOfStringDigs {
    public static void main(String[] args) {
        System.out.println("sumOfDigits(\"abc098\") = " + sumOfDigits("abc098"));
        System.out.println("sumOfDigits(\"91234\") = " + sumOfDigits("91234"));
        System.out.println("sumOfDigits(\"*A91k234)\") = " + sumOfDigits("*A91k234)"));
    }

    /*
    String -- sum of digits in a string
    Write a method that can return the sum of the digits in a string
     */

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (char each : str.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }
        }
        return sum;
    }
}
