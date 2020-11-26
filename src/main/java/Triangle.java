import static java.lang.Math.sqrt;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        System.out.printf("Треугольник со сторонами %s, %s, %s создан.%n", a, b, c);
    }

    public double area() {
        double p = (double) (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
