package int101.homework02.work01;

public class Utilitor {
    // 1.2 testString
    public static String testString(String value){
        if (value == null){
            throw new NullPointerException();
        }
        if (value.isBlank()){
            throw new IllegalArgumentException();
        }
        return value;
    }
    // 1.3 testPositive
    public static double testPositive(double value){
        if (value > 0){
            return value;
        }
        throw new IllegalArgumentException();
    }
    // 1.4 computeIsbn10
    public static long computeIsbn10(long isbn10){
        long checkDigit = 0,
        productNum = 2, 
        result = 0;
        while (isbn10 != 0) {
            result += (isbn10 % 10) * productNum;
            isbn10 /= 10;
            productNum++;
            checkDigit++;
        }
        if (checkDigit != 9) throw new IllegalArgumentException();
        if (result % 11 == 0){
            return 0;
        }
        long finalResult = 11 - (result % 11);
        return finalResult;
    }


}
