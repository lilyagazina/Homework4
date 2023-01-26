public class Main {
    public static void main(String[] args) {
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 90;
        if ( speed > 60 ) {
            System.out.println("Если скорость " +speed+ ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " +speed+ ", то можно ездить спокойно");
        }

    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 18;
        if ( age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if ( age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if ( age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if ( age > 24 ){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 3;
        if (age <= 5 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if ( age >= 5 && age <= 14 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

    }
    public static void task6() {
        System.out.println("Задача 6");
        int totalPlacesInTrainCar = 102;
        int seatsPlacesInTrainCar = 60;
        int standingPlacesInTrainCar = totalPlacesInTrainCar - seatsPlacesInTrainCar;
        int busySeatsPlacesInTrainCar = 60;
        int busyStandingPlacesInTrainCar = 35;
        if (busySeatsPlacesInTrainCar  < seatsPlacesInTrainCar ) {
            System.out.println("В вагоне осталось " + (seatsPlacesInTrainCar - busySeatsPlacesInTrainCar) + " сидячих мест");
        } else {
            System.out.println("В вагоне не осталось сидячих мест");
        }
        if (busyStandingPlacesInTrainCar < standingPlacesInTrainCar) {
            System.out.println("В вагоне осталось " + (standingPlacesInTrainCar - busyStandingPlacesInTrainCar) + " стоячих мест");
        } else {
            System.out.println("В вагоне не осталось стоячих мест");
        }

    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 125;
        int two = 125;
        int three = 125;
        if (one > two ) {
            if (one >= three) {
                System.out.println("Число " + one + " самое большее");
            } else {
                System.out.println("Число " + three + " самое большее");
            }
        } else if (two  > one  ) {
            if (two  >= three) {
                System.out.println("Число " + two  + " самое большее");
            } else {
                System.out.println("Число " + three + " самое большее");
            }
        } else if (one > three) {
                System.out.println("Число " + one + " самое большее");
            } else if (three > one) {
                System.out.println("Число " + three + " самое большее");
            }else {
                System.out.println("Все 3 числа равны");
            }
    }

}

