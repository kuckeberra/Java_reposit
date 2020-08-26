package ru.stqa.sandbox;

public class Pointsdata {
    public double p1;
    public double p2;
    public double p3;
    public double p4;
    public Pointsdata (double p1, double p2, double p3, double p4) {
      this.p1=p1;
      this.p2=p2;
      this.p3=p3;
      this.p4=p4;
    }
  public double distance () {
    return Math.sqrt((this.p3-this.p1)*(this.p3-this.p1)+(this.p4-this.p2)*(this.p4-this.p2));
  }
}