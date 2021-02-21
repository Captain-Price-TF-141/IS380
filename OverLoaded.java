//Captain-Price-TF-141

import java.util.Scanner;

public class OverLoaded
{

    static final double pi = Math.PI;
    
	private static double length;

    static double area(double radius)
    {
        return pi * radius * radius;

    }

    static double area(double lenght, double width)
    {
        return length * width;
    }


    static double area(double radius, float height)
    {
        return pi * radius * radius * height;
    }


    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius of the circle: ");

        double circleRadius = sc.nextDouble();

        System.out.print("enter length and width of the recentangle: ");

        double recentangleLength = sc.nextDouble();

        double recentangleWidth = sc.nextDouble();

        System.out.print("enter radius and height of the cylinder: ");

        double cylinderRadius = sc.nextDouble();

        float cylinderHeight = sc.nextFloat();

        
        System.out.print("");

        
        System.out.println("the area of the circle is: " + OverLoaded.area(circleRadius));

        
        System.out.println("the area of the recentangle is: " + OverLoaded.area(recentangleLength, recentangleWidth));


        System.out.println("the area of the cylinder is: " + OverLoaded.area(cylinderRadius, cylinderHeight));



    }
}