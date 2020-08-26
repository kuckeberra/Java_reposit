package ru.stqa.sandbox;

public class points {
  public static void main(String[] args) {

    Pointsdata P = new Pointsdata(0, 1, 2, -2);
    System.out.println("points distance =" + distance(P));
  }
  public static double distance (Pointsdata P){
    return Math.sqrt((P.p3-P.p1)*(P.p3-P.p1)+(P.p4-P.p2)*(P.p4-P.p2));
  }
}

