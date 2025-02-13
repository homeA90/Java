package chapter_6.Lesson_5;

import java.util.ArrayList;

public class ArrayList_04 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        // <> 제너릭을 사용하는 이유는 타입을 제한하기 위해서 사용함
        // 만약 <> 을 사용하지 않는다면 어떤 타입이든 저장 할 수 있음
        // 그리고 제네릭<> 은 동적으로 변경해야할 때 사용.
        // [] 이건 고정되고, 한종류의 타입만 저장 가능

        nameList.add("김신의");
        nameList.add("이윤수");
        nameList.add("성태호");
        nameList.add("문종모");
        nameList.add("김재원");
        nameList.add("박준하");
        nameList.add("권순현");
        nameList.add("박윤석");
        nameList.add("서혜린");

        nameList.remove(3);

        System.out.println(nameList.size());
        System.out.println(nameList.get(3));
        System.out.println(nameList);

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        for (int num : numList) { // for-each문
            System.out.println(num * num);
        }
    }
}
