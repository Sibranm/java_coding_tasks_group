package week04;

public class FrequencyOfChars {
    public static void main(String[] args) {
         /*
    String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
        frequencyOfChars("AAABBCDD");
        frequencyOfChars("aabcccd");
    }

    public static void frequencyOfChars(String str) {

        String result = "";
        for (
                int i = 0; i < str.length(); i++) {
            String let = str.charAt(i) + "";
            int count = 0;
            if (!result.contains(let)) {
                result += let;
                for (int j = i; j < str.length(); j++) {
                    if (let.equals(str.charAt(j) + "")) {
                        count++;
                    }
                }
                result += count;
            }
        }
        System.out.println(result);

        /* solution with ArrayList:
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));


        String result = "";
        for (String each : list) {
            int count = Collections.frequency(list,each);
            result += (!result.contains(each)) ? (each + count) : "";
        }
        System.out.println(result);*/
    }

}
