public class Main {
    public static void main(String[] args) {
            task1();
            task2();
        }
    public static void task1() {
        int operationSystem = 4;
        switch (operationSystem) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Для данной операционной системы нет приложения");

        }
    }
    public static void task2() {
        int clientDeviceYear = 2013;
        int operationSystem = 1;
        if (operationSystem == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (operationSystem == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Для данной операционной системы нет приложения");
        }
    }
}