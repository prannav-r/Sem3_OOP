//Java program to perform the multiplication of two matrices.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Matrix 1
        System.out.print("Enter number of rows for Matrix 1:");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix 1:");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter ("+(i+1)+","+(j+1)+")element: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for Matrix 2
        System.out.print("Enter number of rows for Matrix 2:");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix 2:");
        int cols2 = scanner.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible");
            System.exit(0);
        }

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter ("+(i+1)+","+(j+1)+")element: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        //Multiplication
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        //Displaying the resultant matrix
        System.out.println("Resultant matrix-");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}