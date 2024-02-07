public class Ejercicio3 {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                suma += i;
                contador++;
                System.out.println(i);
            }
        }
}