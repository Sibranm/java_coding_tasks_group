package week02;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {

        divisible3_5_15();
    }
    public static void divisible3_5_15(){

        String divisible15 = "Divisible By 15: ";
        String divisible5 = "Divisible By 5: ";
        String divisible3 = "Divisible By 3: ";

        for (int i = 1; i <= 100; i++) {

            if(i % 15 == 0){
                divisible15 += i + " ";
            } else if (i % 5 == 0) {
                divisible5 += i + " ";
            } else if (i % 3 == 0) {
                divisible3 += i + " ";
            }

        }

        System.out.println(divisible15 + "\n" + divisible5 + "\n" + divisible3);
    }
}
