import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BetGenerator bet = new BetGenerator();

        System.out.print("Digite quantos números terão na sua aposta: ");
        int numbers = input.nextInt();

        while (numbers < 6 || numbers > 20) {
            System.out.println("O número deve estar entre 6 e 20!");
            System.out.print("Digite quantos números terão na sua aposta: ");
            numbers = input.nextInt();
        }

        bet.setNumbersInBet(numbers);

        System.out.printf("Digite quantas apostas de %d número você quer: ", bet.getNumbersInBet());
        int bets = input.nextInt();

        bet.setBets(bets);
        bet.showBets();
    }
}
