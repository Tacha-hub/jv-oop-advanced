package core.basesyntax;

public class Square extends Figure {
    private double sideSquare;

    public Square(double sideSquare, Color color) {
        this.sideSquare = sideSquare;
        this.color = color;
    }

    public Square() {

    }


    @Override
    public void draw() {
        System.out.println("square area: " + sideSquare * sideSquare
                + " sq. units, side: " + sideSquare + " units, color: " + ColorSupplier.getRandomColor());
    }
}
