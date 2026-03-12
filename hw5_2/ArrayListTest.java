package hw5_2;

public class ArrayListTest {
    public static void main(String[] args) {

        // 테스트용 리스트 만들기
        ArrayList<Integer> list = new ArrayList<>();

        list.add(80);
        list.add(75);
        list.add(90);
        list.add(62);
        list.add(10);
        list.add(12);
        list.add(20);
        list.add(-50);

        System.out.println("리스트: "+ list);
        System.out.println("리스트 개수: " + list.size());
    }
}
