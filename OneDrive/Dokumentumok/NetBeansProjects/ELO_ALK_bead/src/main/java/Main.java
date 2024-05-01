import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race(new String[]{"red", "green", "blue"}, 5);

        System.out.println("Place your bet on a snail (red, green, blue): ");
        String betColor = scanner.nextLine();
        race.placeBet(betColor);
        
        race.startRace();
        scanner.close();
    }
}
