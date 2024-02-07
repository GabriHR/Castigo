import java.util.Scanner;

public class Ejercicio9 {
    public static int[] recibirVector(int dimension) {
        int[] vector = new int[dimension];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduce el elemento " + (i + 1) + " del vector:");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }
}