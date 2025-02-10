package chapter_6.Lesson_4.Example_4_12;

public class UnitConverter {
    // 필요한 상수 정의
    private static final double KILOGRAMS_PER_POUND = 0.45359237;
    private static final double POUNDS_PER_KILOGRAM = 2.20462;
    private static final double CENTIMETERS_PER_INCH = 2.54;
    private static final double INCHES_PER_CENTIMETER = 0.393701;


    public static double toPounds(double kilograms) {
        // 메소드 내부를 채워주세요
        return POUNDS_PER_KILOGRAM * kilograms;
    }

    public static double toKilograms(double pounds) {
        // 메소드 내부를 채워주세요
        return KILOGRAMS_PER_POUND * pounds;
    }

    public static double toCentimeters(double inches) {
        // 메소드 내부를 채워주세요
        return CENTIMETERS_PER_INCH * inches;
    }

    public static double toInches(double centimeters) {
        // 메소드 내부를 채워주세요
        return INCHES_PER_CENTIMETER * centimeters;
    }

    public static double toFahrenheit(double celsius) {
        // 메소드 내부를 채워주세요
        return celsius * ((double) 9 / 5) + 32;
    }

    public static double toCelsius(double fahrenheit) {
        // 메소드 내부를 채워주세요
        return (fahrenheit - 32) * ((double) 5 / 9);
    }
}
