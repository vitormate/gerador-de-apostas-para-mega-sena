import java.util.ArrayList;
import java.util.Random;

public class BetGenerator {
    private int bets;
    private int numbersInBet;

    public int getNumbersInBet() {
        return numbersInBet;
    }

    public void setNumbersInBet(int numbersInBet) {
        this.numbersInBet = numbersInBet;
    }

    public void setBets(int bets) {
        this.bets = bets;
    }

    public ArrayList<Integer> generatorBet() {
        ArrayList<Integer> bet = new ArrayList<Integer>();
        for (int i = 0; i < numbersInBet; i++) {
            int numero = new Random().nextInt(1,60);
            if (bet.contains(numero)) {
                i--;
            } else {
                bet.add(numero);
            }
        }
        return bet;
    }

    public void showBets() {
        for (int i = 0; i < bets; i++) {
            System.out.println(generatorBet());
        }
    }
}