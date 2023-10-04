package week02;

public class Task02SimaConsecutive {

    public static void main(String[] args) {
        consecutiveNums(20);
    }
    public static void consecutiveNums(int num){

        for(int i = 1; i <= num; i++){

            String output = "";

            if(i % 2 == 0){
                output += "Codility";
            }
            if(i % 3 == 0){
                output += "Test";
            }
            if(i % 5 == 0){
                output += "Coders";
            }
            System.out.println(output.isEmpty() ? i : output);
        }


    }
}
