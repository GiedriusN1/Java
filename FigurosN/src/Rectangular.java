public class Rectangular extends Figure2D implements Color{
    private double height;
    private double width;
    private int color;

    public Rectangular(double height, double width) {
        if (height <= 0) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " height must be higher than 0");
        }
        if (width <= 0) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " width must be higher than 0");
        }
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return (height * width);
    }

    @Override
    public double perimeter() {
        return (2 * (height + width));
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    final private double belenkas() {
        return 1.23456;
    }
}
