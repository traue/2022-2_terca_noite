package uninove.matematica;

public class Bhaskara {

    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;

    //métodos modificadores de acesso (encapsulamento):
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    //cálculos:
    private double calculaDelta() {
        delta = (b * b) - 4 * a * c;
        return delta;
    }

    public void calculaBhaskara() {
        calculaDelta();
        if (delta > 0) {
            x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
        }
    }
}
