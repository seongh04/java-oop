package lab2;

// Circle 클래스는 추상 클래스 Shape를 상속받는다
public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Circle other) {
        this.radius = other.getRadius();
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * radius * radius; // A = πr^2
    }

    // 객체 정보를 출력하기 위한 메소드
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "반지름: " + radius + " " + "면적: " + getArea();
    }
}
