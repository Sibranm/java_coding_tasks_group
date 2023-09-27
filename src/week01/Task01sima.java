package week01;

public class Task01sima {
    public static void main(String[] args) {
        identify(20);
    }

    public static void identify(int num){
        if(num % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
