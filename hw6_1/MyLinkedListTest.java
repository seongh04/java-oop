package hw6_1;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list1 = new MyLinkedList<String>();

        // add 테스트
        list1.add("Kim");
        list1.add("Park");
        list1.add("Jung");
        list1.add("Choi");

        System.out.println("리스트: " + list1);

        // add(index, object) 테스트
        System.out.println();
        list1.add(1, "Lee");
        System.out.println("인덱스 1에 'Lee' 추가: " + list1);

        list1.add(0, "Bae");
        System.out.println("맨 앞에 'Bae' 추가:: " + list1);

        list1.add(list1.size(), "Yeon");
        System.out.println("맨 뒤에 'Yeon' 추가: " + list1);

        // remove 테스트
        System.out.println();
        list1.remove(5);
        System.out.println("인덱스 5 삭제: " + list1);

        list1.remove(list1.size() - 1);
        System.out.println("마지막 노드 삭제: " + list1);

        list1.remove(0);
        System.out.println("첫 번째 노드 삭제: " + list1);

        // size 테스트
        System.out.println();
        System.out.println("현재 크기: " + list1.size());

        // removeAll 테스트
        System.out.println();
        list1.removeAll();
        System.out.println("전체 삭제 후: " + list1);

    }

}
