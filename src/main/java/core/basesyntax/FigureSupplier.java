package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        int number = random.nextInt(5);
        switch (number) {
            case 0:
                return new Square(random.nextDouble(100),
                        ColorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextDouble(100),
                        random.nextDouble(100),
                        ColorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextDouble(100),
                        random.nextDouble(100),
                        ColorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextDouble(100),
                        ColorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble(100),
                        random.nextInt(100), random.nextDouble(100),
                        ColorSupplier.getRandomColor());
            default:
                return getDefaultFigure();

        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
