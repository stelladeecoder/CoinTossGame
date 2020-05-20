import java.util.Random;
import java.util.concurrent.Callable;

public class CoinTossGame {

    public int tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        return toss;
    }


    public static void main(String[] args) {
        CoinTossGame game = new CoinTossGame();
    System.out.println(game.tossACoin());

            }

}
