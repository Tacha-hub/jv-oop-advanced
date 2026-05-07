package core.basesyntax;

public class Rectangle extends Figure{
    private double sideRectangle1;
    private double sideRectangle2;

    public Rectangle(double sideRectangle1, double sideRectangle2, Color color) {
        this.sideRectangle1 = sideRectangle1;
        this.sideRectangle2 = sideRectangle2;
        this.color = color;
    }

    public Rectangle() {

    }


    @Override
    public void draw() {
        System.out.println("rectangle area: " + sideRectangle1 * sideRectangle2
                + " sq. units, first side: " + sideRectangle1
                + " sq. units, second side: " + sideRectangle2 + " units, color: " + ColorSupplier.getRandomColor());
    }
}
