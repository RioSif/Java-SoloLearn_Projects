package Shapes;

import java.util.Scanner;

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Shapes.Square a = new Shapes.Square(x);
        Shapes.Circle b = new Shapes.Circle(y);
        a.area();
        b.area();
    }
}