import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of quarts of water to be transformed to quarts: ");
        int amount = input.nextInt();
        int gallons = amount / 4;
        int qrtsLeft = amount % 4;
        System.out.println("A job that needs " + amount + " quarts of water requires " + gallons + " gallons, plus " + qrtsLeft + " quarts of water left.");
    }
}
