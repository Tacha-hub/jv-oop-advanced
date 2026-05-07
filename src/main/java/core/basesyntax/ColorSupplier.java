package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        Random random = new Random();
        Color[] color = Color.values();
        return color[random.nextInt(color.length)];
    }
}
