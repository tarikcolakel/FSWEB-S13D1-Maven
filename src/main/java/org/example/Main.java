package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println(shouldWakeUp(true, 26));
        System.out.println(hasTeen(112, 20, 25));
        System.out.println(isCatPlaying(true, 40));
        System.out.println(area(-1, 4.0));
        System.out.println(area(5.0));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        return (clock < 8 || clock > 20) && isBarking;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return  -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return  -1;
        }
        return radius * radius * Math.PI;
    }
}
