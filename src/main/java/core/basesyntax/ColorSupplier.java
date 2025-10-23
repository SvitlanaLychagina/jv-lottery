package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colours.values().length);
        Colours colour = Colours.values()[index];
        return colour.toString();
    }
}
