package SecondWeekHomeworks;

public class Car {
    private int luggageCapacity;
    private int monthlyRentalFee;
    private int dailyRentalFee;
    private String color;
    private int age;

    public Car() {

    }

    public Car(int luggageCapacity, int monthlyRentalFee, int dailyRentalFee, String color, int age) {
        this();
        this.luggageCapacity = luggageCapacity;
        this.monthlyRentalFee = monthlyRentalFee;
        this.dailyRentalFee = dailyRentalFee;
        this.color = color;
        this.age = age;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public int getMonthlyRentalFee() {
        return monthlyRentalFee;
    }

    public void setMonthlyRentalFee(int monthlyRentalFee) {
        this.monthlyRentalFee = monthlyRentalFee;
    }

    public int getDailyRentalFee() {
        return dailyRentalFee;
    }

    public void setDailyRentalFee(int dailyRentalFee) {
        this.dailyRentalFee = dailyRentalFee;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
