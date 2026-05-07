package core.basesyntax;

public class Circle extends Figure {
    private double radiusCircle;

    public Circle(double radiusCircle, Color color) {
        this.radiusCircle = radiusCircle;
        this.color = color;
    }

    public Circle() {
    }

    @Override
    public void draw() {
        System.out.println("circle area: " + Math.PI * radiusCircle
                + " sq. units, radius: " + radiusCircle + " units, color: "
                + ColorSupplier.getRandomColor());
    }
}
