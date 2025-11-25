import java.awt.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(10, 10, 40, 30);
        System.out.println("box1: " + box1);

        Rectangle box2 = new Rectangle(0, 0, 100, 50);
        System.out.println("box2: " + box2);

        box1.setLocation(20, 20);

        box2.setSize(50, 30);

        System.out.println("After moving/resizing:");
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);

        Rectangle box3 = box1.intersection(box2);

        int area = (int) box3.getWidth() * (int) box3.getHeight();
        System.out.println("box3 (intersection): " + box3);
        System.out.println("Area of box3: " + area);
    }
}