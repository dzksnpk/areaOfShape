package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double s;
        double r;
        double area;

        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();

        switch (shape) {
            case "triangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                s = (a + b + c) / 2; // Perimeter/2
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.print(area);
                break;
            case "rectangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                area = a * b;
                System.out.print(area);
                break;
            case "circle":
                r = sc.nextDouble();
                area = 3.14 * r * r;
                System.out.print(area);
                break;
            default:
                System.out.println("Unknown shape");
                break;
        }
    }
}
