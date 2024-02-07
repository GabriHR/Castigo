public class Ejercicio6 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        while (count < 10) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}