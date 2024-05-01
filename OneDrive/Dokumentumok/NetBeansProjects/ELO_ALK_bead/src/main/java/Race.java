import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Snail> snails;
    private int rounds;
    private String bet;

    public Race(String[] colors, int rounds) {
        this.rounds = rounds;
        snails = new ArrayList<>();
        for (String color : colors) {
            snails.add(new Snail(color));
        }
    }

    public void placeBet(String color) {
        this.bet = color;
    }

    public void startRace() {
        for (int i = 0; i < rounds; i++) {
            System.out.println("Round " + (i + 1));
            for (Snail snail : snails) {
                boolean boost = Math.random() < 0.2;
                snail.advance(boost);
                System.out.println(snail.getColor() + " snail moved to " + snail.getPosition() + (boost ? " with boost" : ""));
            }
            System.out.println();
        }
        declareWinner();
    }

    private void declareWinner() {
        Snail winner = snails.get(0);
        for (Snail snail : snails) {
            if (snail.getPosition() > winner.getPosition()) {
                winner = snail;
            }
        }
        System.out.println("The winner is the " + winner.getColor() + " snail!");
        checkBets(winner.getColor());
    }

    private void checkBets(String winningColor) {
        if (winningColor.equalsIgnoreCase(bet)) {
            System.out.println("Your bet on " + winningColor + " won!");
        } else {
            System.out.println("Your bet did not win.");
        }
    }
}
