import java.util.Scanner;

public class Calculator {
    double num1;
    double num2;

    static int addition(int num1,int num2) {
        return num1 + num2;
    }

    static int substraction(int num1, int num2) {
        return num1 - num2;
    }

    static int divide(int num1, int num2) {
        return num1 / num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which operation do you wanna perform ? ( + , - , / , * )");
        String operation = sc.nextLine();

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int result = 0;

        switch (operation) {
            case "+":
                result = addition(num1, num2);
                break;
            case "-":
                result = substraction(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            case "*":
                result = substraction(num1, num2);
                break;
        
            default:
                System.out.println("You entered invalid operation choice");
                break;
        }
        System.out.println("Result: " + result);
    }
}