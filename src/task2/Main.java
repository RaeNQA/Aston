package task2;

public class Main {
    public static void main(String[] args) {
        Calculate circle = new Circle(4, "Синий", "Красный");
        Calculate rectangle = new Rectangle(4, 6, "Белый", "Зелёный");
        Calculate triangle = new Triangle(3, 4, 5, "Желтый", "Розовый");

        System.out.println("Круг:");
        circle.Display();
        System.out.println();

        System.out.println("Прямоугольник:");
        rectangle.Display();
        System.out.println();

        System.out.println("Треугольник:");
        triangle.Display();
        triangle.cPerim();
    }
}

