import java.awt.Color;

/**
 * This class describes a circle with a given radius and color.
 *
 * @author Diane Han
 * @version Spring 25
 */

public class Circle {  
    // private instance variable, not accessible from outside this class
    private double radius;
    private Color color;
    private double area;

    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    public Circle() {
        radius = 1.0;
        this.color = new Color(255,119,65);
    }

    /** * Constructs a Circle with a specified radius and color. 
     * @param r the radius of the circle
     * @param clr the color of the circle */

    // 2nd constructor with given radius and color
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    /** * Returns the radius of the circle.
     * @return the radius */

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    /** * Returns the color of the circle. 
     * @return the color */
    // A public method for retrieving the color of circle
    public Color getColor() {
        return color;
    }

    /** * Returns the area of the circle. * This method calls calculateArea() internally. 
     * @return the area of the circle */
    // A public method for retrieving the area of circle
    public double getArea() {
        calculateArea();
        return area;
    }
    // A private method for computing the area of circle
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
