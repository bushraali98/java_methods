import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int number1 = input.nextInt();
        System.out.println("Input the second number: ");
        int number2 = input.nextInt();
        System.out.println("Input the third number: ");
        int number3 = input.nextInt();

        System.out.println("The smallest value is: ");
        findMin(number1, number2, number3);

        System.out.println("Enter a number: ");
        number1 = input.nextInt();
        checkNum(number1);

        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): \n");

        String password = input.next();
        if (passwordCheck(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Not a valid password: " + password);
        }
    }


//    1 - Write a Java method to find the smallest number among three
//    numbers.
//    Test Data:
//    Input the first number: 25
//    Input the Second number: 37
//    Input the third number: 29
//    Expected Output:
//    The smallest value is 25.0

    static int min = 0;

    public static void findMin(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else min = num3;
        System.out.println(min);
    }


//    2 - Write a Java method that check if the entered number is negative or
//    positive or zero.

    public static void checkNum(int num) {
        if (num == 0 ) {
            System.out.println("The number is zero");
        } else if (num > 0) {
            System.out.println("Positive");
        } else System.out.println("Negative");
    }


//    3 - Write a Java method to check whether a string is a valid password.
//    Password rules:
//    A password must have at least ten characters.
//    A password consists of only letters and digits.
//    A password must contain at least two digits.
//    Expected Output:
//            1. A password must have at least eight characters.
//            2. A password consists of only letters and digits.
//            3. A password must contain at least two digits
//    Input a password (You are agreeing to the above Terms and
//            Conditions.):
//    abcd1234
//    Password is valid: abcd1234

    public static boolean passwordCheck(String pass) {
        if (pass.length() < 8) return false;

        int charCount = 0;
        int numCount = 0;

        for (int i = 0; i < pass.length(); i++) {
            char l = pass.charAt(i);
            if (l >= '0' && l <= '9') numCount++;
            else if ((l = Character.toUpperCase(l)) >= 'A' && l <= 'Z') {
                charCount++;
            } else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }
    




}