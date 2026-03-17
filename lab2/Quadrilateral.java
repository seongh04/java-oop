package lab2;

public class Quadrilateral extends Shape {
    private int x1, y1, x2, y2;

    public Quadrilateral(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Quadrilateral(Quadrilateral quad) {
        this.x1 = quad.getX1();
        this.y1 = quad.getY1();
        this.x2 = quad.getX2();
        this.y2 = quad.getY2();
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "좌표: " + "(" + x1 + "," + y1 + ")" + " " + "(" + x2 + "," + y2 + ")" + " " + "면적: " + getArea();
    }
}
