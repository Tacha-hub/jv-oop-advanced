package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideTrapezoid1;
    private double sideTrapezoid2;
    private double heightTrapezoid;

    public IsoscelesTrapezoid(double sideTrapezoid1, double sideTrapezoid2,
                              double heightTrapezoid, Color color) {
        this.sideTrapezoid1 = sideTrapezoid1;
        this.sideTrapezoid2 = sideTrapezoid2;
        this.heightTrapezoid = heightTrapezoid;
        this.color = color;
    }

    public IsoscelesTrapezoid() {
    }

    @Override
    public void draw() {
        System.out.println("trapezoid area: "
                + ((sideTrapezoid1 + sideTrapezoid2) * heightTrapezoid) / 2
                + " sq. units, first side: " + sideTrapezoid1 + " sq. units, second side: "
                + sideTrapezoid2 + " sq. units, height: " + heightTrapezoid + " units, color: "
                + ColorSupplier.getRandomColor());
    }
}
