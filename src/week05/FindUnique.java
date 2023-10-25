package week05;

public class FindUnique {
    /*
    String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {
        findTheUnique("AAABBBCCCDEF");
        findTheUnique("ABBABACCFDEJ");
    }

    public static void findTheUnique(String str) {
//        String output = "";
//        for (int i = 0; i < str.length(); i++) {
//
//            int count = 0;
//            String let = str.charAt(i) + "";
//
//                for (int j = 0; j < str.length(); j++) {
//                    if (let.equals(str.charAt(j) + "")) {
//                        count++;
//                    }
//                }
//                if (count == 1) {
//                    output += let;
//                }
//        }
//        System.out.println(output);

//        String output = "";
//        String[] arr = str.split("");
//        for (String each : arr) {
//            int count = Collections.frequency(Arrays.asList(arr),each);
//            if(count == 1){
//                output += each;
//            }
//        }
//        System.out.println(output);

        String output = "";
        for(int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                output += str.charAt(i);
            }
        }
        System.out.println(output);
    }
}
