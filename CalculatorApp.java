import java.util.Scanner;
//import java.util.Scanner for the user input

public class CalculatorApp { //creating class named CalculatorApp
        //Method for Addition
        public static double add(double a,double b){ //Added method for the addition using double as return type
            return a + b;
        }

        //Method for Subtraction
        public static double subtract(double a,double b){
            return a - b;
        }

        //Method for Multiplication
        public static double multiply(double a,double b){
            return a * b;
        }

        //Method for Division
        public static double divide(double a,double b){
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Error: Cannot divide by zero!");
                return Double.NaN; //Special "Not a number" value
            }
        }

        //Method for modulus
    public static double modulus(double a,double b){
            return a % b;
    }

        //Method for power
    public static double power(double a,double b){
            return Math.pow(a, b);
    }

    //Method for square root
    public static double squareRoot(double a){
            if (a >= 0) {
                return Math.sqrt(a);
            } else {
                System.out.println("Error: Cannot take square root of a negative number!");
                return Double.NaN;
            }
    }

        public static void main (String[]args)
        {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("\n=== Advanced Calculator ===");

                System.out.println("Choose operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (x)");
                System.out.println("4. Division (/)");
                System.out.println("5. Modulus (%)");
                System.out.println("6. Power (^)");
                System.out.println("7. Square Root");
                System.out.println("8. Exit");

                System.out.println("Enter choice (1-8): ");
                int choice = scanner.nextInt();

                if (choice == 8) {
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    continue;
                }

                double num1, num2, result;

                switch (choice){
            case 1:
                System.out.println("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = add(num1, num2);
                System.out.println("Result: "+ result);
                break;
            case 2:
                System.out.println("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = subtract(num1, num2);
                System.out.println("Result: "+ result);
                break;
            case 3:
                System.out.println("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = multiply(num1, num2);
                System.out.println("Result: "+ result);
                break;
            case 4:
                System.out.println("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = divide(num1, num2);
                if (!Double.isNaN(result)){
                    System.out.println("Result: " + result);
                }
                break;
            case 5:
                System.out.println("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = modulus(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 6:
                System.out.println("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = power(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 7:
                System.out.println("Enter a number: ");
                num1 = scanner.nextDouble();
                result = squareRoot(num1);
                result = squareRoot(num1);
                if (!Double.isNaN(result)){
                System.out.println("Result: " + result);
                }
                break;
                    default:
                        System.out.println("Invalid");
                }
            }
            scanner.close();
        }
}