import java.util.Objects;

public class Point2D {

    private double x;
    private double y;

    public Point2D() {
        x = y = 0;
    }

    public Point2D(double x_in, double y_in) {
        x = x_in;
        y = y_in;
    }

    @Override
    public String toString() {
        return String.format("[ %.1f , %.1f ]", x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        /*
        Note: this uses EXACT equality for floating point values
         */
        return Double.compare(point2D.x, x) == 0 &&
                Double.compare(point2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point2D rhs) {
        double delta_x = x - rhs.x;
        double delta_y = y - rhs.y;
        double sum_of_squares = Math.pow(delta_x, 2) + Math.pow(delta_y, 2);
        return Math.sqrt(sum_of_squares);
    }
}
