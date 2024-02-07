import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Introduce un numero entero positivo (o un numero negativo para terminar):");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
    }
}