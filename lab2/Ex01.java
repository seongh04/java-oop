package lab2;

import java.util.Scanner;

/**
 * 클래스 상속 연습
 */
public class Ex01 {
    public static void main(String[] args) {
        Rectangle recA = new Rectangle(11, 6);
        Rectangle recB = new Rectangle(3, 22);

        // 사용자 입력을 위한 Scanner 객체 생성
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("=========================================");

            // toString 메서드를 이용하여 Rectangle 정보 출력
            System.out.println("Rectangle A: " + recA);
            System.out.println("Rectangle B: " + recB);

            // 두 Rectangle의 넓이 비교
            if (recA.getArea() == recB.getArea()) {
                System.out.println("Rectangle A와 B의 넓이는 같습니다: " + recA.getArea());
            } else {
                System.out.println("Rectangle A와 B의 넓이가 같지 않습니다.");
            }

            System.out.println("=========================================");

            // Rectangle B의 새로운 너비 입력
            System.out.println("Rectangle B의 새로운 너비를 입력하세요 (-1을 입력하면 종료):");
            int newWidth = input.nextInt();
            if (newWidth == -1) {
                break;
            }
            recB.setWidth(newWidth);

            // Rectangle B의 새로운 높이 입력
            System.out.println("Rectangle B의 새로운 높이를 입력하세요 (-1을 입력하면 종료):");
            int newHeight = input.nextInt();
            if (newHeight == -1) {
                break;
            }
            recB.setHeight(newHeight);

        }

        input.close();
    }
}
