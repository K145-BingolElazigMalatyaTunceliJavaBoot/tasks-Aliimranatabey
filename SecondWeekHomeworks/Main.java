package SecondWeekHomeworks;

public class Main {
    public static void main(String[] args) {
        RentHatchback rentHatchback = new RentHatchback();
        RentSedan rentSedan = new RentSedan();
        RentSuv rentSuv = new RentSuv();
        rentHatchback.netPay();
        rentSedan.netPay();
        rentSuv.netPay();

    }
}
