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
        System.out.println("La suma de los multiplos de 5 entre 1 y 100 es: " + suma);
        System.out.println("La cantidad de multiplos de 5 entre 1 y 100 es: " + contador);
    }
}