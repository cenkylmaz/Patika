import java.util.Scanner;

public class Matris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz :");
        int row = scanner.nextInt();

        System.out.print("Matrixin sütun  sayısını giriniz :  ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Matrixin eleman sayılarını giriniz : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Orjinal Matrix  :");
        printMatrix(matrix);
        int newRows = column;
        int newColumns = row;
        int[][] transpose = new int[newRows][newColumns];

        for (int i = 0; i < newRows; i++) {
            for (int j = 0; j < newColumns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }


    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
