package robot;

public class Robot {

    public static final int DEFAULT_X_POSITION = 0;
    public static final int DEFAULT_Y_POSITION = 0;

    public static final Point DEFAULT_POSITION = new Point(DEFAULT_X_POSITION, DEFAULT_Y_POSITION);

    private Point point;

    public Robot() {
        this.point = DEFAULT_POSITION;
    }

    public void move(Point point) {
        validatePoint(point);
        this.point = point;
    }

    private void validatePoint(Point point) {
        if (point.getX() > 0 || point.getY() > 0){
            throw new IllegalArgumentException("Не правильные координаты!");
        }
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Robot - " + point;
    }
}
