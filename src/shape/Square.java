package shape;

public class Square {
    double side;

    Square(double side)
    {
        this.side = side;
    }

    double Area()
    {
        return this.side * this.side;
    }

    double Parementer()
    {
        return 4 * this.side;
    }
}
