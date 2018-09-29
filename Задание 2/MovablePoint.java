public class MovablePoint implements Movable
{
   protected int x, y, xSpeed, ySpeed;

    MovablePoint()
    {
        x = 0;
        y = 0;
        xSpeed = 0;
        ySpeed = 0;
    }
    MovablePoint(int x, int y, int xSpeed, int ySpeed )
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveDown() {
         y-=ySpeed;
    }

    @Override
    public void moveLeft() {
         x-=xSpeed;
    }

    @Override
    public void moveRight() {
         x+=xSpeed;
    }

    @Override
    public void moveUp() {
         y+=xSpeed;
    }
}
