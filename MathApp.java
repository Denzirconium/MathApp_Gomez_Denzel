
package mathapp;

import java.util.Scanner;

public class MathApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        int choice;
        int n;

        do {
            System.out.println("\n!! MATH APP MENU !!");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Factorial");
            System.out.println("6. Power");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if prime");
            System.out.println("9. GCD");
            System.out.println("10. Absolute value");
            System.out.println("11. Average of N numbers");
            System.out.println("12. Maximum of N numbers");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    double a = input.nextDouble();

                    System.out.print("Enter second number: ");
                    double b = input.nextDouble();

                    System.out.println("Result: " + (a + b));

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    a = input.nextDouble();

                    System.out.print("Enter second number: ");
                    b = input.nextDouble();

                    System.out.println("Result: " + (a - b));

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    a = input.nextDouble();

                    System.out.print("Enter second number: ");
                    b = input.nextDouble();

                    System.out.println("Result: " + (a * b));

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    a = input.nextDouble();

                    System.out.print("Enter second number: ");
                    b = input.nextDouble();

                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    n = input.nextInt();

                    if (n < 0) {
                        System.out.println("Error: Factorial cannot be negative.");
                    } else {
                        long factorial = 1;

                        for (int i = 1; i <= n; i++) {
                            factorial = factorial * i;
                        }

                        System.out.println("Result: " + factorial);
                    }

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 6:
                    System.out.print("Enter base (x): ");
                    double x = input.nextDouble();

                    System.out.print("Enter exponent (y): ");
                    double y = input.nextDouble();

                    System.out.println("Result: " + Math.pow(x, y));

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 7:
                    System.out.print("Enter N: ");
                    n = input.nextInt();

                    if (n < 1) {
                        System.out.println("Error: N must be at least 1.");
                    } else {
                        int sum = 0;

                        for (int i = 1; i <= n; i++) {
                            sum = sum + i;
                        }

                        System.out.println("Result: " + sum);
                    }

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 8:
                    System.out.print("Enter a number: ");
                    n = input.nextInt();

                    boolean prime = true;

                    if (n < 2) {
                        prime = false;
                    } else {
                        for (int i = 2; i < n; i++) {
                            if (n % i == 0) {
                                prime = false;
                                break;
                            }
                        }
                    }

                    if (prime) {
                        System.out.println(n + " is prime.");
                    } else {
                        System.out.println(n + " is not prime.");
                    }

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 9:
                    System.out.print("Enter first number: ");
                    int num1 = input.nextInt();

                    System.out.print("Enter second number: ");
                    int num2 = input.nextInt();

                    num1 = Math.abs(num1);
                    num2 = Math.abs(num2);

                    if (num1 == 0 && num2 == 0) {
                        System.out.println("Error: GCD is undefined.");
                    } else {
                        while (num2 != 0) {
                            int temp = num2;
                            num2 = num1 % num2;
                            num1 = temp;
                        }

                        System.out.println("GCD: " + num1);
                    }

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 10:
                    System.out.print("Enter a number: ");
                    double number = input.nextDouble();

                    System.out.println("Absolute value: " + Math.abs(number));

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 11:
                    System.out.print("Enter N: ");
                    n = input.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] numbers = new double[n];
                        double total = 0;

                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            numbers[i] = input.nextDouble();
                            total = total + numbers[i];
                        }

                        double average = total / n;

                        System.out.println("Average: " + average);
                    }

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 12:
                    System.out.print("Enter N: ");
                    n = input.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] numbers = new double[n];

                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            numbers[i] = input.nextDouble();
                        }

                        double maximum = numbers[0];

                        for (int i = 1; i < n; i++) {
                            if (numbers[i] > maximum) {
                                maximum = numbers[i];
                            }
                        }

                        System.out.println("Maximum: " + maximum);
                    }

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");

                    System.out.println("Press Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;
            }

        } while (choice != 0);

        input.close();
    }
}

