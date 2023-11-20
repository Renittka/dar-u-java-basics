package figure;

public class Square extends Figure {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double findPerimeter() {
        return 4 * side;
    }

    @Override
    public double findArea() {
        return Math.pow(side, 2);
    }

}
