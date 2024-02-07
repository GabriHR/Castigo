import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0, count = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        do {
            System.out.println("Introduce un numero entero (0 para terminar):");
            num = scanner.nextInt();
            if (num != 0) {
                sum += num;
                count++;
                if (num < min) min = num;
                if (num > max) max = num;
            }
        } while (num != 0);
    }
}