public class MovableRectangle extends MovablePoint
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
        checkSpeed(xSpeed,ySpeed);
    }

    @Override
    public void moveRight() {
        bottomRight.moveRight();
        topLeft.moveLeft();
    }

    @Override
    public void moveLeft() {
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public void moveDown() {
        bottomRight.moveDown();
        topLeft.moveDown();
    }

    @Override
    public void moveUp() {
        bottomRight.moveUp();
        topLeft.moveUp();
    }

    public void checkSpeed(int xSpeed, int ySpeed)
    {
        if (xSpeed != ySpeed)
        {
            System.out.println("Значения скоростей не равны! Движение не возможно!");

        }
    }
    public String toString()
    {
        return  "Позиция прямоугольника: " + topLeft.y + " " + topLeft.x + " " + bottomRight.y + " " + bottomRight.x;
    }
}
