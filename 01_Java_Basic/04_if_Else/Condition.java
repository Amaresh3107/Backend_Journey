import java.util.*;

public class Condition {
    public static void main(String[] args) {
        // 1. if, else
        // Scanner sc = new Scanner (System.in);
        // int age = sc.nextInt();

        // if (age>= 18) {
        //     System.out.println("You are eligible to vote.");
        // } else {
        //     System.out.println("You are not eligible to vote.");
        // }

        // 2. if, else
        // Scanner sc = new Scanner (System.in);
        // int x = sc.nextInt();

        // if (x % 2 == 0) {
        //     System.out.println("even");
        // }
        //  else {
        //     System.out.println("Odd");
        // }

        // 3. if, else if, else
        // Scanner sc = new Scanner (System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // if (x > y) {
        //     System.out.println("x is greater than y");
        // } else if (x < y) {
        //     System.out.println("x is less than y");
        // } else {
        //     System.out.println("x is equal to y");
        // }

        // Switch case
        // Scanner sc = new Scanner (System.in);
        // int button = sc.nextInt();
        // switch (button) {
        //     case 1:
        //         System.out.println("Hello 1");
        //         break;
        //     case 2:
        //         System.out.println("Hello 2");
        //         break;
        //     case 3:
        //         System.out.println("Hello 3");
        //         break;
        //     default:
        //         System.out.println("Invalid button");
        // }

        // 4. Calculator
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        
    }
}

    