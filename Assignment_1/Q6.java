//Java program to solve a system of linear equations using Cramer's rule.

public class Q6 {
    public static double determinant(double[][] matrix) {
        int n = matrix.length;

        if (n == 1) {
            return matrix[0][0];
        }

        double det = 0;
        for (int i = 0; i < n; i++) {
            double[][] subMatrix = new double[n - 1][n - 1];
            for (int row = 1; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (col < i) {
                        subMatrix[row - 1][col] = matrix[row][col];
                    } else if (col > i) {
                        subMatrix[row - 1][col - 1] = matrix[row][col];
                    }
                }
            }
            det += matrix[0][i] * Math.pow(-1, i) * determinant(subMatrix);
        }
        return det;
    }
    public static void main(String[] args)
        {
        double[][] coefficients = {
                { 2, -1, 3 },
                { 4, 2, -2 },
                { 3, -4, 1 }
        };
        double[] constants = { 5, 6, 2 };

        double detA = determinant(coefficients);
        if (detA == 0) {
            System.out.println("The system has no unique solution.");
            return;
        }

        double[][] tempMatrix = new double[coefficients.length][coefficients.length];
        for (int i = 0; i < coefficients.length; i++) {
            for (int j = 0; j < coefficients.length; j++) {
                tempMatrix[j][i] = coefficients[j][i];
            }

            for (int j = 0; j < coefficients.length; j++) {
                tempMatrix[j][i] = constants[j];
            }

            double detAi = determinant(tempMatrix);

            for (int j = 0; j < coefficients.length; j++) {
                tempMatrix[j][i] = coefficients[j][i];
            }

            System.out.println("x" + (i + 1) + " = " + (detAi / detA));
        }
    }
}