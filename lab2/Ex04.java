// package lab2;

// /**
//  * 사각형 클래스 테스트
//  */
// public class Ex04 {
//     public static void main(String[] args) {
//         Quadrilateral quad1 = new Quadrilateral(4, 8, -1, 5);
//         Quadrilateral quad2 = new Quadrilateral(-15, 7, -12, -4);

//         System.out.println("===========================================================");

//         System.out.println("Quadrilateral 1: " + quad1);
//         System.out.println("Quadrilateral 2: " + quad2);

//         Quadrilateral quad3 = new Quadrilateral(quad1); // 복사 생성자

//         System.out.println("Quadrilateral 3 (복사본): " + quad3);

//         double quad1Area = quad1.getArea();
//         double quad2Area = quad2.getArea();

//         // 두 사각형의 면적 비교
//         if (quad1Area > quad2Area) {
//             System.out.println("Quadrilateral 1이 Quadrilateral 2보다 넓습니다.");
//         } else if (quad1Area < quad2Area) {
//             System.out.println("Quadrilateral 2가 Quadrilateral 1보다 넓습니다.");
//         } else {
//             System.out.println("두 Quadrilateral의 면적이 같습니다.");
//         }
//     }

// }
