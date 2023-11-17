package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong number of arguments. Enter three arguments separated by a space: number1 operation(+ - / *) number2");
            return;
        }
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[2]);
            String operation = args[1];

            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: divided by zero");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: unknown operation");
                    return;
            }
            System.out.println("Result : " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing numbers. Enter valid numeric values.");
        }
    }
}
