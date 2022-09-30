package SecondWeekHomeworks;

public class RentSedan extends Car implements RentCar {

    @Override
    public void dayRent() {
        System.out.println("Günlük Kiraladiniz ! ");
    }

    @Override
    public void companyRent() {
        System.out.println("Şirkete Kiraladiniz ! ");

    }

    @Override
    public void netPay() {
        setDailyRentalFee(40);
        setMonthlyRentalFee(getDailyRentalFee() * 30);
        System.out.println("Net Month Pay Sedan: " + getMonthlyRentalFee());
    }

    public void monthRent() {
        System.out.println("Aylık Kiraladiniz ! ");
    }

}
