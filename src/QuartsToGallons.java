import java.util.Scanner;

public class QuartsToGallons {
    public static void main(String[] args) {
        final int needed = 18;
        final int qrtsGall = 4;
        int gallons = needed / qrtsGall;
        int qrtsLeft = needed % qrtsGall;


        System.out.println("A job that needs " + needed + " quarts of water requires " + gallons + " gallons, plus " + qrtsLeft + " quarts of water left.");
    }
}