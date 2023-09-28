package week01;

public class Task03SimaFINRA {

    public static void main(String[] args) {

        finra();
    }
    public static void finra(){

        for (int i = 1; i <= 30; i++) {

            String result = "";
            if(i % 3 == 0){
                result += "FIN";
            }

            if(i % 5 == 0){
                result += "RA";
            }

            System.out.println((result.isBlank()) ? i : result);

        }
    }
}
