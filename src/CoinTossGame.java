import java.util.Random;
import java.util.concurrent.Callable;

public class CoinTossGame {

    public String tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0) {
            return "Heads";
        } else {
            return "Tails";
        }

    }


    public static void main(String[] args) {
        CoinTossGame game = new CoinTossGame();
    System.out.println(game.tossACoin());

            }

}
