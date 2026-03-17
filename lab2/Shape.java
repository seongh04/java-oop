package lab2;

// abstract 클래스를 만들 때는 "abtract" 키워드를 사용한다
// abstract 클래스는 직접 인스턴스를 생성할 수 없다
public abstract class Shape {

    // 이 메서드는 Shape를 상속받는 자식 클래스에서 구현해야 한다
    public abstract double getArea();
}
