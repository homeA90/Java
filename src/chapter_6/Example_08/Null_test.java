package chapter_6.Example_08;

public class Null_test {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        people[0] = new Person("강지훈", 34);
        people[2] = new Person("조규리", 30);
        people[4] = new Person("강훈", 28);

        for (int i =0; i<people.length; i++) {
            if(people[i] != null){
                System.out.println(people[i].getName());
            } else {
                System.out.println(i + "번 자리는 비었습니다.");
            }
        }
    }
}
