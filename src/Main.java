//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        int clientOS=1;
        if (clientOS==0){
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }
        else {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }

        //2
        int clientDeviceYear = 2009;
        if (clientOS==0){
            if (clientDeviceYear<2015){
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
            }
            else{
                System.out.println("«Установите версию приложения для iOS по ссылке»");
            }
        }
        else {
            if (clientDeviceYear<2015){
                System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
            }
            else {
                System.out.println("«Установите версию приложения для Android по ссылке»");
            }
        }

        //3
        int year = 2021;
        boolean isLeapYear=(((year-1584)%4==0)||((year-1584)%100==0))&&((year-1584)%100!=0);
        if (isLeapYear){
            System.out.println("«"+year+" год является високосным»");
        }
        else {
            System.out.println("«"+year+" год не является високосным»");
        }

        //4
        int deliveryDistance = 115;
        int days=0;
        if (deliveryDistance<=20){
            days=1;
        }
        else if (deliveryDistance<=60){
            days=2;
        }
        else if (deliveryDistance<=100){
            days=3;
        }

        if (days!=0){
            System.out.println("Потребуется дней: "+days+".");
        }
        else {
            System.out.println("Доставки нет.");
        }

        //5
        int monthNumber=11;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Неверный месяц!");

        }
    }
}