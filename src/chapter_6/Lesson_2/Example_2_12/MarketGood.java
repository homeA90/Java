package chapter_6.Lesson_2.Example_2_12;

public class MarketGood {
    public final String name;
    public final int retailPrice;
    private int discountRate;


    //COnstructor
    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;

        if (discountRate >= 0 && discountRate <= 100) {
            this.discountRate = discountRate;
        } else {
            this.discountRate = 0;
        }

    }

    public MarketGood(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
    }


    //getter
//    public String getName() {
//        return name;
//    }

//    public int getRetailPrice() {
//        return retailPrice;
//    }

//    public int getDiscountRate() {
//        return discountRate;
//    }


    //setter
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountedPrice() {
        //return (retailPrice * (100-discountRate))/100;
        //return (int) (retailPrice * (1 - discountRate / 100.0));
        return (int) (retailPrice * (1 - (double) discountRate / 100));
        // 10 / 100을 하면 원하는 0.1이 아니라 0이 나오기 때문에 double로 캐스팅 해줘야 함
    }


}
