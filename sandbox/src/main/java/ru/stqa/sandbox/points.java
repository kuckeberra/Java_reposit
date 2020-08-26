package ru.stqa.sandbox;

public class points {
  public static void main(String[] args) {

    double x = 0;
    double y = 1;
    double z = 2;
    double w = -2;
    double t = (z-x)*(z-x);
    double r = (w-y)*(w-y);
    double s = (t+r);
    System.out.println("points distance =" + Math.sqrt(s));
  }
}
