package assignment2;

import java.util.Random;

public class FlipCoin {

    /**
     * 
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(2);

    }
}
