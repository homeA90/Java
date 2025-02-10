package chapter_6.Lesson_2.Example_2_12;

public class Main {
    public static void main(String[] args) {
        MarketGood g1 = new MarketGood("MacBook Air", 1250000);
        MarketGood g2 = new MarketGood("MacBook Pro", 2990000, 15);
        MarketGood g3 = new MarketGood("iPhone 7", 920000, 20);


        // final을 사용하여 변수가 변경 불가능하게 해놓고 getName()을 바로 name/retailPrice 개별 인스턴스 변수로 사용하도록 번경
        System.out.println(g1.name + "의 할인율: " + g1.retailPrice + "%");
        System.out.println(g2.name + "의 할인율: " + g2.retailPrice + "%");
        System.out.println(g3.name + "의 정상 가격: " + g3.retailPrice + "원");
        System.out.println(g3.name + "의 할인 가격: " + g3.getDiscountedPrice() + "원");
        System.out.println("경쟁 업체가 많아져서 " + g3.name + "의 할인율이 35%로 올랐습니다.");
        g3.setDiscountRate(35);
        System.out.println(g3.name + "의 할인 가격: " + g3.getDiscountedPrice() + "원");


        /* getName 을 이용한 코드
        System.out.println(g1.getName() + "의 할인율: " + g1.getDiscountRate() + "%");
        System.out.println(g2.getName() + "의 할인율: " + g2.getDiscountRate() + "%");
        System.out.println(g3.getName() + "의 정상 가격: " + g3.getRetailPrice() + "원");
        System.out.println(g3.getName() + "의 할인 가격: " + g3.getDiscountedPrice() + "원");
        System.out.println("경쟁 업체가 많아져서 " + g3.getName() + "의 할인율이 35%로 올랐습니다.");
        g3.setDiscountRate(35);
        System.out.println(g3.getName() + "의 할인 가격: " + g3.getDiscountedPrice() + "원");
        */
    }
}
