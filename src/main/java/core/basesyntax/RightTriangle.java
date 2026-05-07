package core.basesyntax;

public class RightTriangle extends Figure {
    private double legRightTriangle1;
    private double legRightTriangle2;

    public RightTriangle(double legRightTriangle1, double legRightTriangle2, Color color) {
        this.legRightTriangle1 = legRightTriangle1;
        this.legRightTriangle2 = legRightTriangle2;
        this.color = color;
    }

    public RightTriangle() {

    }


    @Override
    public void draw() {
        System.out.println("rectangle area: " + (legRightTriangle1 * legRightTriangle2) / 2
                + " sq. units, first leg: " + legRightTriangle1
                + " sq. units, second leg: " + legRightTriangle2 + " units, color: " + ColorSupplier.getRandomColor());
    }
}
