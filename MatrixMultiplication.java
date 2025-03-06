public class MatrixMultiplication {
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
    if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
    System.out.println("Matrices must have the same dimensions for addition.");
    return null;
    }

    int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
  
    
    for (int i = 0; i < matrix1.length; i++) {
    for (int j = 0; j < matrix1[0].length; j++) {
    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
    }
    }
  
    return resultMatrix;
    }
  
    public static void main(String[] args) {
    int[][] matrixA = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
    };
  
    int[][] matrixB = {
    {9, 8, 7},
    {6, 5, 4},
    {3, 2, 1}
    };
  
    int[][] sumMatrix = addMatrices(matrixA, matrixB);
  
    if (sumMatrix != null) {
    System.out.println("Matrix A:");
    printMatrix(matrixA);
  
    System.out.println("\nMatrix B:");
    printMatrix(matrixB);
  
    System.out.println("\nSum of Matrix A and Matrix B:");
    printMatrix(sumMatrix);
    }
    }
  
    public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
    for (int element : row) {
    System.out.print(element + " ");
    }
    System.out.println();
    }
    }
   }
  