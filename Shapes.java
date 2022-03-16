public class Shapes {
    void area(float s)
    {
        System.out.println("The area of the square is "+Math.pow(s, 2)+" sq units");
    }

    void area(float l, float b)
    {
        System.out.println("The area of the rectangle is "+(l+b)+" sq units");
    }

    void area(float a, float b, float c)
    {
        double temp = (a + b + c);
        double s= temp/2;
        double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is "+triarea+" sq units");
    }

    void area(double r)
    {
        System.out.println("The area of the circle "+(3.14 * r * r)+" sq units");
    }
}


class Oopsconcept{
    public static void main(String args[])
    {
        Shapes sh = new Shapes();
        sh.area(7);
        sh.area(12,10);
        sh.area(5,7,9);
        sh.area(5.5);
    }
}