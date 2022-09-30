package SecondWeekHomeworks;

public class RentHatchback extends Car implements RentCar {

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
        setDailyRentalFee(30);
        setMonthlyRentalFee(getDailyRentalFee() * 30);
        System.out.println("Net Month Pay Hatchback: " + getMonthlyRentalFee());

    }

    public void nationalRent() {
        System.out.println("Vatandaşa Kiraladiniz ! ");
    }

}
