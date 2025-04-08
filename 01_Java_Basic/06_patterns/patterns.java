import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of * in a rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of * in a columns: ");
        int m = sc.nextInt();

        // Pattern 1 - Rectangle/Square
        System.out.println("Pattern 1 - Rectangle/Square");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();            
        }


        // Pattern 2 - Hollow Rectangle
        System.out.println("Pattern 2 - Hollow Rectangle");
        for (int i =1; i<=n; i++){
            for (int j=1; j<=m; j++){
                if (i==1 || i==n || j==1 || j==m){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        // Pattern 3 - half pyramid
        System.out.println("Pattern 3 - Half Pyramid");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n1 = sc1.nextInt();
        for (int i = 1; i<=n1; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //Pattern 4 - Inverted Half Pyramid
        System.out.println("Pattern 4 - Inverted Half Pyramid");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n2 = sc2.nextInt();
        for (int i = n2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //Pattern 5 - inverted & rotated half pyramid
        System.out.println("Pattern 5 - inverted & Rotated Half Pyramid");
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n3 = sc3.nextInt();
        for (int i=1;i<=n3;i++){
            for (int j=1;j<=n3-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Pattern 6 - Numbered Half Pyramid
        System.out.println("Pattern 6 - Numbered Half Pyramid");
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n4 = sc4.nextInt();
        for (int i = 1; i <= n4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        // Pattern 7 - Numbered Inverted Half Pyramid
        System.out.println("Pattern 7 - Numbered Inverted Half Pyramid");
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n5 = sc5.nextInt();
        for (int i = n5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Pattern 8 - floyd's triangle
        System.out.println("Pattern 8 - Floyd's Triangle");
        Scanner sc6 = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n6 = sc6.nextInt();
        int num = 1;
        for (int i = 1; i <= n6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // Pattern 9 - 0-1 triangle
        System.out.println("Pattern 9 - 0-1 Triangle");
        Scanner sc7 = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n7 = sc7.nextInt();
        for (int i = 1; i <= n7; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                     System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }       
            }
            System.out.println();
        }
    }
}
