public class Zadanie1 {
    public static void main(String[] args) {


        boolean isRaining;
        boolean isSunny;

        isSunny = false;
        isRaining = false;

        if ((isSunny == true) && (isRaining == true)) {
            System.out.println("rainbow");
        } else if ((isSunny == true) && (isRaining == false)) {
            System.out.println("sunny");
        } else if ((isSunny == false) && (isRaining == true)) {
            System.out.println("plucha");
        } else if ((isSunny == false) && (isRaining == false)) {
            System.out.println("cloudy");
        }
    }

}
