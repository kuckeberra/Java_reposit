public class MyProgramm {

    public static void main(String[] args) {
        mmm("Masha");

        double l = 5;
        System.out.println("ploschad " + l + "=" + area(l));
    }
    public static void mmm (String ttt) {
        System.out.println("Hello " + ttt);
    }
    public static double area(double len) {
        return len*len;
    }
}