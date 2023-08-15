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
    }
}