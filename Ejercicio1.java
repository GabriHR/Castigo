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
}