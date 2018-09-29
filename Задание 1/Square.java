public class Square extends Rectangle
{
    @Override
    public String toString()
    {
        return "side " + width + " filled " + filled;
    }
    public Square()
    {
        width = 0;
        length = 0;
        color = "";
        filled = false;
    }
    public Square(double side)
    {
        width = side;
        length = side;
        color = "";
        filled = false;
    }
    public Square(double side,String color, boolean filled)
    {
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }
    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    public double getSide() {
        return width;
    }
}