public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
        public static void task3() {
            short speed = 60;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
            }
        }
        public static void task4() {
            byte age = 11;
            if(age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            }
            if(age >= 7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            }
            if(age > 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
            }
            if(age > 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
            }
        }
        public static void task5() {
        byte age = 3;
        if(age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if(age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе " +
                                "в сопровождении родителей");
        }
        if(age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе");
        }
        }
}
