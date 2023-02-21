public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
        public static void task1() {
            byte age = 17;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + " лет, то он достиг совершеннолетия.");
                } else {
                    System.out.println("Если возраст человека равен " + age + " лет, то он недостиг совершеннолетия, " +
                        "нужно немного подождать.");
                }
        }
        public static void task2() {
            byte temp = 2;
            if (temp >= 5) {
                System.out.println("На улице " + temp + " градусов, можно идти без шапки");
                } else {
                    System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
                }
        }
}
