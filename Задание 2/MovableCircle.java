public class MovableCircle extends MovablePoint
{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int xSpeed, int ySpeed, int y, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    public String toString()
    {
        return  "Позиция круга: " + center.y + " " + center.x + " радиус: " + radius;
    }
}
