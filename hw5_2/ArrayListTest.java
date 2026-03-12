package hw5_2;

public class ArrayListTest {
    public static void main(String[] args) {

        // 테스트용 리스트 만들기
        ArrayList<Integer> list = new ArrayList<>();

        // add 테스트
        list.add(80);
        list.add(75);
        list.add(90);
        list.add(62);
        list.add(10);
        list.add(12);
        list.add(20);
        list.add(-50);

        System.out.println("리스트: " + list);
        System.out.println("리스트 개수: " + list.size());

        System.out.println();

        list.add(2, 999);
        System.out.println("999 넣은 후: " + list);

        System.out.println();

        // remove 테스트
        int removed = list.remove(3);
        System.out.println("삭제된 값: " + removed);
        System.out.println("삭제 후 리스트: " + list);

        System.out.println();

        // removeAll 테스트
        list.removeAll();
        // System.out.println("removeAll 이후 리스트: " + list);
        System.out.println("리스트 개수: " + list.size());

        System.out.println();

    }
}
