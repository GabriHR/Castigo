public class Ejercicio1{
    public static long calcularSegundos(int years, int months, int days) {
        short daysInYear = 365;
        byte hoursInDay = 24;
        byte minutesInHour = 60;
        byte secondsInMinute = 60;

        long secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;
        long secondsInMonth = secondsInYear / 12;
        long secondsInDay = secondsInYear / daysInYear;

        return years * secondsInYear + months * secondsInMonth + days * secondsInDay;
    }

    public static void main(String[] args) {
        int years = 1;
        int months = 2;
        int days = 3;
        long seconds = calcularSegundos(years, months, days);
        System.out.println("El numero de segundos en " + years + " años, " + months + " meses y " + days + " dias es: " + seconds);
    }
}