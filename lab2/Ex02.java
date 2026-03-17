package lab2;

/**
 * Circle 클래스와 Rectangle 클래스를 이용한 넓이 비교
 * Shape 클래스의 getArea() 메서드 오버라이딩 확인
 */
public class Ex02 {
    public static void main(String[] args) {
        System.out.println("=========================================");

        Circle circle = new Circle(6);
        System.out.println("Circle: " + circle);

        Rectangle rec1 = new Rectangle(10, 5);
        System.out.println("Rectangle: " + rec1);

        // 두 객체의 넓이를 비교
        if (rec1.getArea() > circle.getArea()) { // Shape 타입의 메서드(getArea)가 각 객체에 맞게 다르게 동작함
            System.out.println("Rectangle이 Circle보다 넓습니다");
        } else if (rec1.getArea() < circle.getArea()) {
            System.out.println("Circle이 Rectangle보다 넓습니다");
        } else {
            System.out.println("Rectangle과 Circle의 넓이가 같습니다.");
        }

    }
}
