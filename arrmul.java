public class arrmul {

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
    int rows1 = matrix1.length;
    int cols1 = matrix1[0].length;
    int rows2 = matrix2.length;
    int cols2 = matrix2[0].length;
  
    // Check if multiplication is possible
    if (cols1 != rows2) {
    System.out.println("Matrices cannot be multiplied. Incompatible dimensions.");
    return null;
    }
  
    // Create the result matrix
    int[][] resultMatrix = new int[rows1][cols2];
  
    // Perform matrix multiplication
    for (int i = 0; i < rows1; i++) {
    for (int j = 0; j < cols2; j++) {
    for (int k = 0; k < cols1; k++) {
    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
    }
    }
    }
  
    return resultMatrix;
    }
  
    public static void main(String[] args) {
    int[][] matrixA = {
    {1, 2, 3},
    {4, 5, 6}
    };
  
    int[][] matrixB = {
    {7, 8},
    {9, 10},
    {11, 12}
    };
  
    int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
  
    if (productMatrix != null) {
    System.out.println("Matrix A:");
    printMatrix(matrixA);
  
    System.out.println("\nMatrix B:");
    printMatrix(matrixB);
  
    System.out.println("\nProduct of Matrix A and Matrix B:");
    printMatrix(productMatrix);
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
  