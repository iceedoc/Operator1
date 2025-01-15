public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int human = 18;
        if (human >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не совершеннолетний,стоит подождать");
        }
        System.out.println("\nTask 2");
        int gold = 5;
        if (gold <= 5) {
            System.out.println("На улице холодно,надень шапку");
        } else {
            System.out.println("Можно идти без шапки");
        }
        System.out.println("\nTask 3");
        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если  скорость " + speed + ",придет заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
        System.out.println("\nTask 4");
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println(" Если возраст человека равен " + age + " то стоит ходить в садик");
        }
        if (age >= 7 && age <= 17) {
            System.out.println(" Если возраст человека равен " + age + " то стоит ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println(" Если возраст человека равен " + age + " то стоит ходить в университет");
        }
        if (age > 24) {
            System.out.println(" Если возраст человека равен " + age + " то стоит ходить на работу");
        }
        System.out.println("\nTask 5");
        int limiter = 4;
        if (limiter < 5) {
            System.out.println("Если возраст ребенка " + limiter + " то ему нельзя кататься на ауттракционе");
        }
        if (limiter >= 5 && limiter <= 14) {
            System.out.println("Если возраст ребенка " + limiter + " то он может кататься с сопровождением взрослого");
        }
        if (limiter > 14) {
            System.out.println("Если возраст ребенка " + limiter + " то он может кататься без взрослого ");
        }
        System.out.println("\nTask 6");
        int places = 78;
        if (places > 102) {
            System.out.println("В вагоне нет свободных мест");
        } else {
            if (places <= 60) {
                System.out.println("В вагоне есть свободные сидячие места ");
            }
            if (places > 60 && places < 102) {
                System.out.println("В вагоне есть свободные стоячие места");
            }
        }
        System.out.println("\nTask 7");

        int a = 1;
        int b = 2;
        int c = 3;
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("\nКонец");
    }
}













