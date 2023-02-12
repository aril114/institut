import Rectangle.Rectangle;

public class Main {
    // простейшее использование класса: создаем прямоугольник и выводим его ширину
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.0, 2.0);
        System.out.println(r.getWidth());
    }
}