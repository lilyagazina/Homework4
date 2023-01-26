public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
    }


    public static void task5() {
        System.out.println("Задача 5");
        int age = 9;
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