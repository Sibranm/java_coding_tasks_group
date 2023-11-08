package week06;

public class PasswordValidation {
    public static void main(String[] args) {

        System.out.println("validatePassword(\"HOI980)\") = " + validatePassword("HOI980)"));
        System.out.println("validatePassword(\"9080jjop=)\") = " + validatePassword("9080jjop=)"));
        System.out.println("validatePassword(\"9080Kjop=)\") = " + validatePassword("9080Kjop=)"));

    }
    /*
    String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean validatePassword(String password) {
        if(password.length() >= 6 && !password.contains(" ")){

            boolean isUpperCase = false;
            boolean isLowerCase = false;
            boolean isDigit = false;
            boolean isSpecialChar = false;

            for (char each : password.toCharArray()) {
                if(Character.isUpperCase(each)){
                    isUpperCase = true;
                }else if(Character.isLowerCase(each)){
                    isLowerCase = true;
                }else if(Character.isDigit(each)){
                    isDigit = true;
                }else if(!Character.isLetterOrDigit(each)){
                    isSpecialChar = true;
                }
            }
            return isDigit && isUpperCase && isLowerCase && isSpecialChar;

        }

        return false;
    }
}
