package week03;

public class ReverseNegativeSima {
    /*

     */
    public static void main(String[] args) {
        System.out.println(reverseNegative(-123));
    }

    public static int reverseNegative(int num){

        if(num >= 0){
            return num;
        }else {

            String number = num + "";
            String[] arr = number.split("");
            String[] newArr = new String[arr.length - 1];

            for (int i = arr.length - 1, j = 0; i > 0; i--, j++) {
                newArr[j] = arr[i];
            }

            String output = "";

            for (String each : newArr) {
                output += each;
            }

            int newNum = Integer.parseInt(output);

            return -newNum;
        }

    }

}
