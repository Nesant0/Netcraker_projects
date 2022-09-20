package testtest;

import java.util.Scanner;

public class QuadraticEquation {
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double a;
    double b;
    double c;

    public double discriminant(){
        return (new Discriminant()).discriminant;
    }

    class Discriminant {

       private double discriminant;

       Discriminant() {
           this.discriminant = (b * b) - (4 * a * c);
       }

   }

    public static void main(String args[]) {
        double firstRoot = 0, secondRoot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("For equation ax^2 + bx + c = 0 \nEnter the a:");
        while (!sc.hasNextDouble()) {
            System.out.println("That's not a number!");
            sc.next();
        }
        double a = sc.nextDouble();

        System.out.println("Enter the b:");
        while (!sc.hasNextDouble()) {
            System.out.println("That's not a number!");
            sc.next();
        }
        double b = sc.nextDouble();

        System.out.println("Enter the c:");
        while (!sc.hasNextDouble()) {
            System.out.println("That's not a number!");
            sc.next();
        }
        double c = sc.nextDouble();

        QuadraticEquation routes = new QuadraticEquation(a, b, c);
        double discriminant = routes.discriminant();
        double sqrt = Math.sqrt(discriminant);

        double epsilon = 0.000001d;
        double zero = 0.0;

        if (Math.abs(a - zero) < epsilon) {
            if (Math.abs(a - zero) < epsilon) {
                System.out.println("Any number is the Root");
            } else {
                System.out.println("Root is: " + (-c / b));
            }
        }
        else {
            if ((discriminant > 0) && (Math.abs(a - zero) > epsilon) && (Math.abs(b - zero) > epsilon)) {
                firstRoot = (-b + sqrt) / (2 * a);
                secondRoot = (-b - sqrt) / (2 * a);
                System.out.println("Roots are: " + firstRoot + " and " + secondRoot);
            }
            else if ((discriminant == 0) && (Math.abs(a - zero) > epsilon) && (Math.abs(b - zero) > epsilon)) {
                System.out.println("Root is: " + (-b + sqrt) / (2 * a));
            }
            else {
                System.out.println("None Roots");
            }
        }
    }
}

