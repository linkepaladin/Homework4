public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
        byte temp = 5;
        if (temp > 5) {
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
        byte age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        byte age = 58;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе " +
                    "в сопровождении родителей");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе");
        }
    }

    public static void task6() {
        int peopleAll = 102;
        int sit = 60;
        int std = peopleAll - sit;
        int people = 89;
        if (people < peopleAll && people < sit) {
            System.out.println("В вагоне осталось " + (sit - people) + " сидячих мест и " + std + " стоячих места.");
        } else if (people >= sit && people <= peopleAll) {
            System.out.println("В вагоне осталось 0 сидячих мест и " + (std - (people - sit)) + " стоячих места.");
        } else if (people >= peopleAll) {
            System.out.println("В вагоне не осталось мест, вагон забит");
        }

    }

    public static void task7() {
        int one = 222;
        int two = 278;
        int three = 278;
        if (one > two) {
            if (two > three) {
                System.out.println("Максимальное значение имеет число One " + one);
            }
            else if (three > two){
                if(one > three){
                    System.out.println("Максимальное значение имеет число One " + one);
                }
                else if (three > one) {
                    System.out.println("Максимальное значение имеет число Three " + three);
                }
            }
        }
        if (two > one) {
            if (one > three){
                System.out.println("Максимальное значение имеет число Two " + two);
            }
            else if (three > one) {
                if (two > three){
                    System.out.println("Максимальное значение имеет число Two " + two);
                }
                else if (three > two){
                    System.out.println("Максимальное значение имеет число Three " + three);
                }
            }
        }
        if (one == two) {
            if(one > three || two > three) {
                System.out.println("Максимальное значение имеет число One и Two " + one);
            }
            else if (one < three || two < three) {
                System.out.println("Максимальное значение имеет число Three " + three);
            }
        }
        if (one == three) {
            if (one > two || three > two) {
                System.out.println("Максимальное значение имеет число One и Three " + three);
            }
            else if (one < two || three < two) {
                System.out.println("Максимальное значение имеет число Two " + two);
            }
        }
        if (two == three) {
            if (two > one || three > one) {
                System.out.println("Максимальное значение имеет число Two и Three " + three);
            }
            else if (two < one || three < one) {
                System.out.println("Максимальное значение имеет число One " + one);
            }
        }
        if (one == two && two == three) {
            System.out.println("Все числа равны");
        }
    }
}


