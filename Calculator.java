import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        boolean firstRun = true;

        while (true) {
            System.out.println("\nCalculator - Jovan Keane Christantio");
            System.out.println("============");
            System.out.println("Total = " + total);
            System.out.println("\n");

            double inputNumber;
            if (firstRun) {
                System.out.print("Input Number: ");
                inputNumber = scanner.nextDouble();
                total = inputNumber;
                firstRun = false;
            } else {
                inputNumber = total;
            }

            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5. modulo");
            System.out.println("6. clear total");
            System.out.println("7. exit");
            System.out.print("Operator [1...7]: ");
            int operator = scanner.nextInt();

            if (operator == 7) {
                System.out.println("Exiting...");
                break;
            }

            double newInput = 0;
            if (operator != 6) {
                System.out.print("Input Number: ");
                newInput = scanner.nextDouble();
            }

            switch (operator) {
                case 1:
                    total += newInput;
                    break;
                case 2:
                    total -= newInput;
                    break;
                case 3:
                    total *= newInput;
                    break;
                case 4:
                    if (newInput != 0) {
                        total /= newInput;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
                case 5:
                    total %= newInput;
                    break;
                case 6:
                    total = 0.0;
                    firstRun = true;
                    break;
                default:
                    System.out.println("Invalid operator! Please select between 1 to 7.");
            }
        }
        scanner.close();
    }
}

