public class Main {
    public static void main(String[] args) {
        task6();
        task7();
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
        int three = 195;
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

