public class Main {

    public static void checkingLeapYear (int year) {
        if (year % 4 == 0 && year%100!=0 || year%400==0){
            System.out.println(year + " - год является високосным");
        } else System.out.println(year + " - год не является високосным");
    }

    public static void installationVersion (int clientOS, int clientYear) {
        if (clientOS == 0){
            if (clientYear < 2015) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else {
            if (clientYear < 2015){
                System.out.println("Установите lite-версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }}

        private static int calculateDeliveryDays(int deliveryDistance) {
            int calculateDeliveryDays = 1;
            if (deliveryDistance > 20){
                calculateDeliveryDays ++;}
            if (deliveryDistance > 60){
                calculateDeliveryDays ++;}

            return calculateDeliveryDays;
        }


    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        //checking leap year -проверка високосного года название метода
        int setYear = 2024;
          checkingLeapYear(setYear);

        //Задание 2
        System.out.println("Задание 2");
        //installationVersion -установка версии
        int clientOS = 1;
        int clientDeviceYear = 2022;
        installationVersion(clientOS, clientDeviceYear);

        //Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));

    }
}