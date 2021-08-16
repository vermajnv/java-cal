package shape;

public class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    double Area()
    {
        return this.length * this.width;
    }

    double Paremeter()
    {
        return 2 * (this.length + this.width);
    }
}

