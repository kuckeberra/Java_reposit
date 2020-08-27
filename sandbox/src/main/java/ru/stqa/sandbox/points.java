package ru.stqa.sandbox;

public class points {
  public static void main(String[] args) {

    Pointsdata1 P1 = new Pointsdata1(0, 1);

    Pointsdata2 P2 = new Pointsdata2(2, -2);
    System.out.println("points distance =" + distance(P1, P2));
  }
  public static double distance (Pointsdata1 P1, Pointsdata2 P2) {
    return Math.sqrt((P2.x-P1.x)*(P2.x-P1.x)+(P2.y-P1.y)*(P2.y-P1.y));
  }
}

