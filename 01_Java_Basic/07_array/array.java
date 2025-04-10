
public class array {
    public static void main(String[] args) {
        // Array declaration
        int[] marks = new int[5]; // array declaration and instantiation
        // int marks[] = new int[5]; // another way to declare an array

        // Array initialization
        marks[0] = 10; // first element
        marks[1] = 20; // second element
        marks[2] = 30; // third element
        marks[3] = 40; // fourth element
        marks[4] = 50; // fifth element

        // Print the array elements
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
// array syntax
// type[] name = new type[size];   "OR"
// datatype[] variableName[] = new datatype[size];

//example: int[] marks =new int[5];
        // marks[0]=10;
        // marks[1]=20;
        // marks[2]=30;

