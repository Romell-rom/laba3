package ru.mirea.lab3;

public class Circle {
    double radius;
    double diameter;
    double length;
    double square;
    public Circle (int radius, int diameter){
        this.radius = radius;
        this.diameter = diameter;
        final double pi = 3.14;

    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public double C(double radius) {return  this.length = 2*3.14*radius;}
    public double S(double radius) {return  this.square = 3.14*3.14*radius;}

}
