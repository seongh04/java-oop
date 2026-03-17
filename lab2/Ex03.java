package lab2;

/**
 * 다형성(Polymorphism) 연습
 * 하나의 Shape 타입으로 여러 객체를 처리하는 다형성 예제
 */
public class Ex03 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        // Shape 배열에 자식 객체들 저장 (다형성)
        shapes[0] = new Rectangle(5, 11);
        shapes[1] = new Rectangle(2, 4);
        shapes[2] = new Circle(12);
        shapes[3] = new Circle(16);
        shapes[4] = new Rectangle(65, 11);
        shapes[5] = new Circle(22);

        System.out.println("=========================================");

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];

            if (shape instanceof Rectangle) {
                System.out.println("[" + i + "] Rectangle: " + shape);
            } else {
                System.out.println("[" + i + "] Circle: " + shape);
            }
        }
    }
}
