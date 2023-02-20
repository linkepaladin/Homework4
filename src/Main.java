public class Main {
    public static void main(String[] args) {
        task1();
    }
        public static void task1() {
            byte age1 = 26;
            byte age2 = 7;
            if (age1 >= 18) {
                System.out.println("Если возраст человека равен " + age1 + " лет, то он достиг совершеннолетия.");
            }
            if (age2 < 18) {
                System.out.println("Если возраст человека равен " + age2 + " лет, то он недостиг совершеннолетия, " +
                        "нужно немного подождать.");
            }
        }
}