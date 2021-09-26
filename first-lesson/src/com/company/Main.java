package com.company;

public class Main {

    public static void main(String[] args) {

	    System.out.println(convert(5));
	    System.out.println((points(13, 12)));
	    System.out.println(footballPoints(3,4, 2));
        System.out.println(divisibleByFive(5));
        System.out.println(and(true, false));
        System.out.println(howManyWalls(54, 1, 43));
        System.out.println(Challenge.squared(5));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(frames(10, 1));
        System.out.println(mod(6, 3));
    }

    public static int convert(int minutes) {
        return minutes * 60;
    }
    public static int points( int twoPoints, int threePoints) {
        return twoPoints * 2 + threePoints * 3;
    }

    public static int footballPoints( int win, int draw, int loose) {
        return win * 3 + draw;
    }

    public static boolean divisibleByFive(int number){
        return number % 5 == 0;
    }

    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }

    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize >  pay;
    }

    public static int frames(int minutes, int fps) {
        return minutes * 60 * fps;
    }

    public static int mod( int dividend, int divide) {
        return dividend - dividend / divide * divide;
    }

}

