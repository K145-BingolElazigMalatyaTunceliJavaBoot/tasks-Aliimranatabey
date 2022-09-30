package SecondWeekHomeworks;

public class RentSuv extends Car implements RentCar {
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
        setDailyRentalFee(50);
        setMonthlyRentalFee(getDailyRentalFee() * 30);
        System.out.println("Net Month Pay Suv: " + getMonthlyRentalFee());
    }

    public void monthRent() {
        System.out.println("Aylık Kiraladiniz ! ");
    }

}
