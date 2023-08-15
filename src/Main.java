public class Main {
    public static void main(String[] args) {

        /* 1 задание */

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("У вас неизвестная операционная система. У нас нет подходящего приложения");
        }
        /* 2 задание */

        int ClientOS = 1;
        int clientDeviceYear = 2015;
        if (ClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (ClientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        } else {
            System.out.println("У вас неизвестная операционная система. У нас нет для вас подходящего приложения");
        }

        /*  3 задание */
        // год должен делиться нацело на 4; не должен делится на 100, а если делится, поделить на 400

        char year = 2021;
        if (year%4 != 0) {
            System.out.println("Обычный год!");
        } else {
            if (year%100 == 0 && year%400 != 0) {
                System.out.println("Обычный год!");
            } else {
                System.out.println("Високосный год!");
            }
        }

        /* 4 задание */

        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + (deliveryDays+1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + (deliveryDays+2));
        }else {
            System.out.println("Извините, в данном районе доставка не осуществляется. Заберите вашу карту в отделении банка.");
        }

        /* 5 задание */
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("В году всего 12 месяцев. Попробуйте еще раз.");

        }
    }
}