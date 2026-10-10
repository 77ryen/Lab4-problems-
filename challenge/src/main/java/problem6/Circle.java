package problem6;

public class Circle extends Form {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle(" + radius + ")";
    }
}
