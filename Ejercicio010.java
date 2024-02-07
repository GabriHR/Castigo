import java.util.Scanner;
import java.util.Random;

public class Ejercicio010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Introduce la dimension de la matriz:");
        int dimension = scanner.nextInt();
        int[][] matriz = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int num = random.nextInt(100);
                matriz[i][j] = num;
                matriz[j][i] = num;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}