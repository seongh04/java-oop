package lab2;

// Rectangle 클래스는 추상 클래스 Shape를 상속받는 자식 클래스이다
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 복사 생성자
    public Rectangle(Rectangle rec) {
        this.width = rec.getWidth();
        this.height = rec.getHeight();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return (double) width * height;
    }

    // 객체 정보를 출력하기 위한 메서드
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "너비: " + width + " " + "높이: " + height + " " + "면적: " + getArea();
    }
}
