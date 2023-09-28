package week01;

public class Task02SimaDivide {

    public static void main(String[] args) {
        divideWithoutOperator(2, 2);
    }

    public static void divideWithoutOperator(int num1, int num2) {

        if (num2 != 0) {
            String output = num1 + " / " + num2 + " = ";
            int result = 0;

            while (num1 >= num2) {

                num1 -= num2;
                result++;

            }

            output += result + " with remainder " + num1;

            System.out.println(output);
        } else {
            System.out.println("Divider can not be " + num2);
        }
    }
}
