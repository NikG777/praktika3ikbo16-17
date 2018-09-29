import java.math.*;
public class Rectangle extends Shape
{
    protected double width;
    protected double length;
    public Rectangle()
    {
        this.width = 0;
        this.length = 0;
        this.filled = false;
        this.color = "df";
    }
    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length,String color, boolean filled )
    {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea()
    {
        return width * length;
    }
    public double getPerimeter()
    {
        return 2*(width+length);
    }
    public String toString()
    {
        return "Rectangle  width " + width + " length " + length + " filled " + filled ;
    }
}