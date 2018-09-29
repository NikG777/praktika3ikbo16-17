public abstract class Shape
{
    protected String color;
    protected boolean filled;
    public abstract  double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
    public void Shape()
    {
        color = "";
        filled = false;
    }
    public void Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


}