import java.util.*;

public class array {
    public static void main(String[] args) {

        // array syntax
        // type[] name = new type[size];   "OR"
        // datatype[] variableName[] = new datatype[size];

        //example: 
        
        // Array declaration
        // int[] marks = new int[5]; // array declaration and instantiation
        // // int marks[] = new int[5]; // another way to declare an array

        // // Array initialization
        // marks[0] = 10; // first element
        // marks[1] = 20; // second element
        // marks[2] = 30; // third element
        // marks[3] = 40; // fourth element
        // marks[4] = 50; // fifth element

        // // Print the array elements
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        //OR

        // Array declaration and initialization
        // int[] numbers = {1, 2, 3, 4, 5}; // array declaration and initialization
        // // int numbers[] = {1, 2, 3, 4, 5}; // another way to declare and initialize an array
        // // Print the array elements
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }
    
        // OR

        // System.out.println("Enter the size of the array: ");
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int[] numbers = new int[size]; // array declaration and instantiation
        // for (int i=0; i<size; i++){
        //     System.out.println("Enter the element at index " + i + ": ");
        //     numbers[i] = sc.nextInt(); // array initialization
        //     } 
        // // Print the array elements
        // System.out.println("The elements of the array are: ");
        // for (int i=0; i<size; i++){
        //     System.out.print(numbers[i]+" ");
        // }
    


        // Assisgnment 1
        //Take an array as input from the user. search for a given number x and print the index at which it occurs.
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];         // array declaration and instantiation
        
        //input
        for (int i=0; i<number.length; i++){
            System.out.print("Enter the element at index " + i + ": ");
            number[i] = sc.nextInt();        // array initialization
            }
        
        System.out.println("Enter the X to be searched: ");
        int x = sc.nextInt();

       //output
        for (int i=0; i<number.length; i++){
            if (number[i] == x){
                System.out.println("X found at index " + i);
            }
        }
        
        // Print the array elements
        System.out.println("The elements of the array are: ");
        for (int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
        
    }
}



