import java.time.LocalDate;

public class Main {

       private final static int checkingYear =LocalDate.now().getYear();

    public static void main(String[] args) {
        System.out.println("Задание 1");
        checkingTheYear(LocalDate.now().getYear());

        System.out.println("Задание 2");
        printVersionOs(LocalDate.now().getYear(), 0);


        System.out.println("Задание 3");
        calculationOfDelivery(95);

    }
    // Задание 1
    public static void checkingTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год Является високосным годом");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    // Задание 2
    public static boolean isNowYear(int year){
        return year == checkingYear;
    }
    public static String getVersionOs(int clientOs) {
        if (clientOs == 0) {
            return "Ios";
        } else if (clientOs == 1) {
            return "Android";
        }
        return "неопознанная операционная система";
        }
    public static void printVersionOs(int year, int clientOs) {
        if (isNowYear(year)){
            System.out.println("Установите полную версию для вашего " + getVersionOs(clientOs));
        } else {
            System.out.println("Установите облегчённую версию для вашего " + getVersionOs(clientOs));
        }
    }
    // Задание 3
    public static void calculationOfDelivery(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);
    }
}
