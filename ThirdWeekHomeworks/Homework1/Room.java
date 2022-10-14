package ThirdWeekHomeworks.Homework1;

public class Room extends Store implements Buy {
    private int roomApple;
    private int roomPear;
    private int roomCherry;

    public Room(int roomApple, int roomPear, int roomCherry) {
        this.roomApple = roomApple;
        this.roomPear = roomPear;
        this.roomCherry = roomCherry;

        // setElma(getElma() - roomApple);
    }

    public int getRoom1Apple() {
        return roomApple;
    }

    public void setRoom1Apple(int room1Apple) {
        this.roomApple = room1Apple;
    }

    public int getRoom1Pear() {
        return roomPear;
    }

    public void setRoom1Pear(int room1Pear) {
        this.roomPear = room1Pear;
    }

    public int getRoom1Cherry() {
        return roomCherry;
    }

    public void setRoom1Cherry(int room1Cherry) {
        this.roomCherry = room1Cherry;
    }

    @Override
    public void buyApple() {
        System.out.println("Kaç Kg Elma Alacaksınız ? ");
        int buyingApple = scan.nextInt();
        setElma(getElma() - buyingApple);
        setRoom1Apple(getRoom1Apple() - buyingApple);
    }

    @Override
    public void buyPear() {
        System.out.println("Kaç Kg Armut Alacaksınız ? ");
        int buyingPear = scan.nextInt();
        setArmut(getArmut() - buyingPear);
        setRoom1Pear(getRoom1Pear() - buyingPear);

    }

    @Override
    public void buyCherry() {
        System.out.println("Kaç Kg Kiraz Alacaksınız ? ");
        int buyingCherry = scan.nextInt();
        setKiraz(getKiraz() - buyingCherry);
        setRoom1Cherry(getRoom1Cherry() - buyingCherry);

    }

}
