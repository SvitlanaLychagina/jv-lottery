package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColour = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100);
        return new Ball(randomColour, randomNumber);
    }
}
