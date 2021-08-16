package shape;

/**
 * Circle
 */
public class Circle {
    public double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }

    double Area() 
    {
        return 3.14 * this.radius * this.radius;
    }

    double Parementer()
    {
        return 2 * 3.14 * this.radius;
    }
}