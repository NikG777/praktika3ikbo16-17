public class TestFigure
{
    public static void main(String[] args)
    {
        // Тестирование круга
        System.out.println("Круг");
        MovableCircle circle = new MovableCircle(1,2,2,4,5);
        circle.moveDown();
        System.out.println(circle.toString());
        circle.moveUp();
        System.out.println(circle.toString());

        // Тестирование прямоугольника
        System.out.println("Прямоугольник");
        MovableRectangle rectangle = new MovableRectangle(6,2,3,4,5,5);
        rectangle.moveDown();
        System.out.println(rectangle.toString());
        rectangle.moveRight();
        System.out.println(rectangle.toString());

        // Проверка на скорость
        System.out.println("Проверка скоростей");
        MovableRectangle rectangle2 = new MovableRectangle(1,2,3,4,5,4);

    }
}
