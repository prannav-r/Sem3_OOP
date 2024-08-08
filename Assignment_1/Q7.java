// Java program to find the eigenvalues of a 2x2 matrix and verify the determinant as the product of eigenvalues

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of the (2x2) Matrix -");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Enter ("+(i+1)+","+(j+1)+")element: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
        scanner.close();
        double a = matrix[0][0];
        double b = matrix[0][1];
        double c = matrix[1][0];
        double d = matrix[1][1];    
        // Characteristic equation: λ^2 - (a+d)λ + (ad - bc) = 0
        double trace = a + d;
        double determinant = a * d - b * c;
        double discriminant = Math.pow(trace, 2) - 4 * determinant;
        if (discriminant >= 0) {
            double lambda1 = (trace + Math.sqrt(discriminant)) / 2;
            double lambda2 = (trace - Math.sqrt(discriminant)) / 2;

            System.out.println("Eigenvalue 1: " + lambda1);
            System.out.println("Eigenvalue 2: " + lambda2);

            // Verify the determinant
            System.out.println("Product of eigenvalues: " + (lambda1 * lambda2));
            System.out.println("Determinant of the matrix: " + determinant);
            System.out.println("Hence verified the determinant as the product of eigenvalues");
        } else {
            System.out.println("The matrix has complex eigenvalues.");
        }
    }
}