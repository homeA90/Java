package chapter_6.Lesson_5.Example_5_5;

import java.util.ArrayList;

public class Main {
    public static int getSurvivingIndex(int n, int k) {
        // 코드를 입력하세요.
        ArrayList<Integer> soldiers = new ArrayList<>();

        // Array List 생성 후 군인들을 배열에 넣기
        for (int soldiersNumber = 1; soldiersNumber <= n; soldiersNumber++) {
            soldiers.add(soldiersNumber);
        }

        // 죽일 군인의 인덱스 0으로 생성
        int killIndex = 0;

        // 즉, 마지막 남은 군사는 죽지 않으므로, n-1번 만큼만 반복문을 실행하여
        // 그 외의 군사들이 죽는 과정을 진행하고, 마지막 남은 군사를 반환
        for (int i = 0; i < n-1; i++) {
            killIndex+=(k-1);          // 아래 k일 때 군사를 죽여야 하므로 k의 해당하는 인덱스는 k-1이 되어야 함. 그리고 k-1 때마다 죽이므로 계속 증가시킴
            if (killIndex < soldiers.size()){
                System.out.println(soldiers.get(killIndex) + "번 군사가 죽습니다.");
                soldiers.remove(killIndex);  // k-1 차례에 군사가 죽었으므로 리스트에서 삭제
            }
            else {
                killIndex = killIndex % soldiers.size(); // 이 문제에서 가장 핵심!!부분
                /*
                그런데 만약 killIndex가 전체 배열의 크기(soldiers.size())를 넘어서면 어떻게 해야할까요?
                그럴 때는 killIndex가 마지막 인덱스에서 0번째 인덱스로 다시 순환되게끔 해주어야 합니다. 원형으로 서있기 때문에, 고리처럼 끝점과 시작점이 이어진다고 상상해보세요!
                이를 해결하기 위한 가장 좋은 방법은 killIndex를 전체 배열의 크기(soldiers.size())로 나눈 나머지로 재지정해주는 것입니다.
                예를 들면, 20번째 장군(인덱스 16)을 제거한 후에는 배열의 크기가 16이 되고, killIndex = 16 + 4가 되어 배열의 크기보다 커지게 되는데요.
                killIndex(다음 killIndex) = (16(현재 killIndex) + 4(파라미터 k - 1)) % 16(배열의 크기)로 지정해줌으로써, killIndex = 4가 되고, 4번 인덱스에 서있는 6번 군사가 죽게 되는 것입니다.
                 */
                System.out.println(soldiers.get(killIndex) + "번 군사가 죽습니다.");
                soldiers.remove(killIndex);
            }
        }

        return soldiers.get(0);
        // 최종 마지막 남은 값의 인덱스 가 0 이기 때문에 작성
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
