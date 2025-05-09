public class Main {
    public static void main(String[] args) {
            task1();
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
}