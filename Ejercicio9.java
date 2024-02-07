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
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimension de los vectores:");
        int dimension = scanner.nextInt();
        int[] vector1 = recibirVector(dimension);
        int[] vector2 = recibirVector(dimension);
        int productoEscalar = calcularProductoEscalar(vector1, vector2);
        System.out.println("El producto escalar de los vectores es: " + productoEscalar);
    }
}