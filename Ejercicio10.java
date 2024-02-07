import java.util.Scanner;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Introduce la dimension de la matriz:");
        int dimension = scanner.nextInt();
        int[][] matriz = new int[dimension][dimension];
    }
}